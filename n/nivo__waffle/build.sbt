organization := "org.scalablytyped"
name := "nivo__waffle"
version := "0.80.0-06e4f4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-4db30e",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-8f9158",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-1117bb",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-a52588",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-3978d5",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-6f203c",
  "org.scalablytyped" %%% "nivo__colors" % "0.80.0-bd8fa4",
  "org.scalablytyped" %%% "nivo__core" % "0.80.0-002c47",
  "org.scalablytyped" %%% "nivo__legends" % "0.80.0-758d96",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-8a1cd9",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-cf549b",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-6206c7",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
