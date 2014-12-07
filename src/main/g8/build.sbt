name := "$name$"

organization := "$organization$"

version := "$version$"

scalaVersion := "2.10.3"

assemblySettings

libraryDependencies ++= Seq(
  "org.scalafx" %% "scalafx" % "1.0.0-R8",
  "org.scalatest" % "scalatest_2.10" % "2.0" % "test" //http://www.scalatest.org/download
)

shellPrompt := { state => System.getProperty("user.name") + "> " }

// add JavaFX 2.0 to the unmanaged classpath
// unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVAFX_HOME") + "/rt/lib/jfxrt.jar"))
// For Java 7 update 06 the JFXRT JAR is part of the Java Runtime Environment
//unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/jre/lib/jfxrt.jar"))
unmanagedJars in Compile += Attributed.blank(file(System.getenv("JAVA_HOME") + "/lib/jfxrt.jar"))


// set the main class for the main 'run' task
// change Compile to Test to set it for 'test:run'
mainClass in (Compile, run) := Some("$package$.HelloScalaFX")
