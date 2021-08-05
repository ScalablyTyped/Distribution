organization := "org.scalablytyped"
name := "plotly_dot_js"
version := "1.54-dt-20201028Z-989552"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3" % "6.2-dt-20201118Z-caae4c",
  "org.scalablytyped" %%% "d3-array" % "2.8-dt-20201116Z-c90f30",
  "org.scalablytyped" %%% "d3-axis" % "2.0-dt-20201104Z-5951d6",
  "org.scalablytyped" %%% "d3-brush" % "2.1-dt-20200930Z-609d45",
  "org.scalablytyped" %%% "d3-chord" % "2.0-dt-20200929Z-85839e",
  "org.scalablytyped" %%% "d3-color" % "2.0-dt-20201117Z-2bf171",
  "org.scalablytyped" %%% "d3-contour" % "2.0-dt-20200930Z-9c371c",
  "org.scalablytyped" %%% "d3-delaunay" % "5.3-dt-20200930Z-a847ad",
  "org.scalablytyped" %%% "d3-dispatch" % "2.0-dt-20200930Z-605b8b",
  "org.scalablytyped" %%% "d3-drag" % "2.0-dt-20201028Z-7eae93",
  "org.scalablytyped" %%% "d3-dsv" % "2.0-dt-20201001Z-97b19e",
  "org.scalablytyped" %%% "d3-ease" % "2.0-dt-20200930Z-a791ac",
  "org.scalablytyped" %%% "d3-fetch" % "2.0-dt-20201001Z-77a345",
  "org.scalablytyped" %%% "d3-force" % "2.1-dt-20201002Z-24899c",
  "org.scalablytyped" %%% "d3-format" % "2.0-dt-20200930Z-83f3bb",
  "org.scalablytyped" %%% "d3-geo" % "2.0-dt-20201002Z-1c78f4",
  "org.scalablytyped" %%% "d3-hierarchy" % "2.0-dt-20200929Z-14e41b",
  "org.scalablytyped" %%% "d3-interpolate" % "2.0-dt-20201001Z-e0e9c1",
  "org.scalablytyped" %%% "d3-path" % "2.0-dt-20201002Z-6a8acd",
  "org.scalablytyped" %%% "d3-quadtree" % "2.0-dt-20200930Z-c11850",
  "org.scalablytyped" %%% "d3-random" % "2.2-dt-20201002Z-4eddb2",
  "org.scalablytyped" %%% "d3-scale" % "3.2-dt-20201104Z-168788",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-199e0c",
  "org.scalablytyped" %%% "d3-shape" % "2.0-dt-20201028Z-793106",
  "org.scalablytyped" %%% "d3-time" % "2.0-dt-20201002Z-8b41a3",
  "org.scalablytyped" %%% "d3-time-format" % "3.0-dt-20201002Z-2e97e5",
  "org.scalablytyped" %%% "d3-timer" % "2.0-dt-20201002Z-12514b",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-42bb2c",
  "org.scalablytyped" %%% "d3-zoom" % "2.0-dt-20201104Z-6abf03",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20201002Z-ae1993",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
