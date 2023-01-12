organization := "org.scalablytyped"
name := "nivo__bar"
version := "0.80.0-d6a599"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-7b411a",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-1117bb",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-a0ef46",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-47ca74",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-72901b",
  "org.scalablytyped" %%% "nivo__annotations" % "0.80.0-37f211",
  "org.scalablytyped" %%% "nivo__axes" % "0.80.0-f6d7e4",
  "org.scalablytyped" %%% "nivo__colors" % "0.80.0-efb10c",
  "org.scalablytyped" %%% "nivo__core" % "0.80.0-d0a433",
  "org.scalablytyped" %%% "nivo__legends" % "0.80.0-ae437a",
  "org.scalablytyped" %%% "nivo__scales" % "0.80.0-6d33f8",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
