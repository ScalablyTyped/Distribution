organization := "org.scalablytyped"
name := "plottable"
version := "3.9.0-043188"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-path" % "2.0-dt-20201002Z-6a8acd",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-a8cb53",
  "org.scalablytyped" %%% "d3-shape" % "2.0-dt-20201028Z-c8f145",
  "org.scalablytyped" %%% "d3-time" % "2.0-dt-20201002Z-54d48e",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-efca7d",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20201105Z-a2958c",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-c43498")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
