organization := "org.scalablytyped"
name := "pascal-case"
version := "2.0.1-c3de23"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-2b46fc",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-6e1f08",
  "org.scalablytyped" %%% "no-case" % "2.3.2-288496",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-da6d8a",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-9e4c41")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        