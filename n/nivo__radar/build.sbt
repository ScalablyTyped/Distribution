organization := "org.scalablytyped"
name := "nivo__radar"
version := "0.80.0-3d12ed"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-f779a1",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-4a0944",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-d2c2a8",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-dc6480",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-29f529",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-afd487",
  "org.scalablytyped" %%% "nivo__colors" % "0.80.0-541a81",
  "org.scalablytyped" %%% "nivo__core" % "0.80.0-54e6a6",
  "org.scalablytyped" %%% "nivo__legends" % "0.80.0-a90d6c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-fada11",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-fab591",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-08aa87",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
