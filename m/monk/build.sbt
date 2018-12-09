organization := "org.scalablytyped"
name := "monk"
version := "6.0.6-635f41"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180910Z-526327",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-42ca48",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181203Z-eb9959",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180910Z-5dc68a",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        