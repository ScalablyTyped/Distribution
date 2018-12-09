organization := "org.scalablytyped"
name := "meteor-publish-composite"
version := "0.0-unknown-dt-20181002Z-75a9d0"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-95bd8f",
  "org.scalablytyped" %%% "csstype" % "2.5.8-b451f0",
  "org.scalablytyped" %%% "meteor" % "1.4-dt-20181020Z-6aeb4d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-87c4ee",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-d83ef6",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20180910Z-595b36")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        