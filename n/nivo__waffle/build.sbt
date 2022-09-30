organization := "org.scalablytyped"
name := "nivo__waffle"
version := "0.80.0-6f346c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstype" % "3.1.1-0912f8",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-20258d",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-97e717",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-bb7662",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-2f39ea",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-94b19b",
  "org.scalablytyped" %%% "nivo__colors" % "0.80.0-539c38",
  "org.scalablytyped" %%% "nivo__core" % "0.80.0-dc0036",
  "org.scalablytyped" %%% "nivo__legends" % "0.80.0-a8636b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-975e63",
  "org.scalablytyped" %%% "react" % "18.0-dt-20220922Z-fc8273",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-3fbb8c",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
