organization := "org.scalablytyped"
name := "nivo__arcs"
version := "0.80.0-6d5e94"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-7b6cf2",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-72e26c",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-97e717",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-604817",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-3bff61",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-b48dde",
  "org.scalablytyped" %%% "nivo__colors" % "0.80.0-5dd8a3",
  "org.scalablytyped" %%% "nivo__core" % "0.80.0-a5599e",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-737217",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220913Z-bad9e4",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fce63f",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
