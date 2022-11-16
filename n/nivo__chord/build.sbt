organization := "org.scalablytyped"
name := "nivo__chord"
version := "0.80.0-eb5f05"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-ab3df7",
  "org.scalablytyped" %%% "d3-chord" % "3.0-dt-20211202Z-a065d9",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-e91a54",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-1117bb",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-4f7309",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-0efd25",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-a50cc0",
  "org.scalablytyped" %%% "nivo__colors" % "0.80.0-c81233",
  "org.scalablytyped" %%% "nivo__core" % "0.80.0-09c8a0",
  "org.scalablytyped" %%% "nivo__legends" % "0.80.0-8a655f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-53873f",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-9ff1b2",
  "org.scalablytyped" %%% "react-spring__types" % "9.5.5-ab26a5",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-ea4558",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
