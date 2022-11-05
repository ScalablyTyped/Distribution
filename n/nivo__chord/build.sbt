organization := "org.scalablytyped"
name := "nivo__chord"
version := "0.80.0-45cb18"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9ea52b",
  "org.scalablytyped" %%% "d3-chord" % "3.0-dt-20211202Z-01ba65",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-9208ca",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-d2c2a8",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-729417",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-f5f0fe",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-7d17be",
  "org.scalablytyped" %%% "nivo__colors" % "0.80.0-ea2bb1",
  "org.scalablytyped" %%% "nivo__core" % "0.80.0-825d26",
  "org.scalablytyped" %%% "nivo__legends" % "0.80.0-ebf30b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-115604",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-e64588",
  "org.scalablytyped" %%% "react-spring__types" % "9.5.5-5b545c",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-21791a",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
