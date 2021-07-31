organization := "org.scalablytyped"
name := "plottable"
version := "3.9.0-11fe79"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3-path" % "2.0-dt-20201002Z-1156c5",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-68e4fa",
  "org.scalablytyped" %%% "d3-shape" % "2.0-dt-20201028Z-f64cca",
  "org.scalablytyped" %%% "d3-time" % "2.0-dt-20201002Z-ab0101",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-a74a74",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20201105Z-7a57e4",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-2aa6fb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
