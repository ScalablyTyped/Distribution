organization := "org.scalablytyped"
name := "nivo__heatmap"
version := "0.80.0-d5ec8e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-775404",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-5b6e2d",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-97e717",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-87be1b",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-3d3755",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-33e699",
  "org.scalablytyped" %%% "nivo__annotations" % "0.80.0-effa9a",
  "org.scalablytyped" %%% "nivo__axes" % "0.80.0-e2cd58",
  "org.scalablytyped" %%% "nivo__colors" % "0.80.0-63df0f",
  "org.scalablytyped" %%% "nivo__core" % "0.80.0-296ded",
  "org.scalablytyped" %%% "nivo__legends" % "0.80.0-79d8c4",
  "org.scalablytyped" %%% "nivo__scales" % "0.80.0-e1424b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4c7983",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-bacd1f",
  "org.scalablytyped" %%% "react-spring__types" % "9.5.5-3d69a4",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-400bee",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
