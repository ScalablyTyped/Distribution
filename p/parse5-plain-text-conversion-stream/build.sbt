organization := "com.scalablytyped"
name := "parse5-plain-text-conversion-stream"
version := "5.0-dt-20181102Z-a32de1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "parse5" % "5.0-dt-20181102Z-6fa58d",
  "com.scalablytyped" %%% "parse5-parser-stream" % "5.0-dt-20181102Z-41fb3f",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        