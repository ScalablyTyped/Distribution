organization := "org.scalablytyped"
name := "plottable"
version := "3.13.0-8a58d1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-97e717",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-5af29b",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-2f39ea",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-94b19b",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-acda78",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20220928Z-c0791d",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-db9125")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
