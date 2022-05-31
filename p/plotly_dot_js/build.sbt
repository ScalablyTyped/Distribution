organization := "org.scalablytyped"
name := "plotly_dot_js"
version := "1.54-dt-20201028Z-cae3cc"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3" % "6.2-dt-20201118Z-67d29f",
  "org.scalablytyped" %%% "d3-array" % "2.8-dt-20201116Z-4ed463",
  "org.scalablytyped" %%% "d3-axis" % "2.0-dt-20201104Z-c95b93",
  "org.scalablytyped" %%% "d3-brush" % "2.1-dt-20200930Z-c36f7e",
  "org.scalablytyped" %%% "d3-chord" % "2.0-dt-20200929Z-e2b11c",
  "org.scalablytyped" %%% "d3-color" % "2.0-dt-20201117Z-92e398",
  "org.scalablytyped" %%% "d3-contour" % "2.0-dt-20200930Z-5f9d5a",
  "org.scalablytyped" %%% "d3-delaunay" % "5.3-dt-20200930Z-05f61f",
  "org.scalablytyped" %%% "d3-dispatch" % "2.0-dt-20200930Z-a038ed",
  "org.scalablytyped" %%% "d3-drag" % "2.0-dt-20201028Z-dc4179",
  "org.scalablytyped" %%% "d3-dsv" % "2.0-dt-20201001Z-15babb",
  "org.scalablytyped" %%% "d3-ease" % "2.0-dt-20200930Z-a791ac",
  "org.scalablytyped" %%% "d3-fetch" % "2.0-dt-20201001Z-3cd993",
  "org.scalablytyped" %%% "d3-force" % "2.1-dt-20201002Z-d41378",
  "org.scalablytyped" %%% "d3-format" % "2.0-dt-20200930Z-5bb964",
  "org.scalablytyped" %%% "d3-geo" % "2.0-dt-20201002Z-886c89",
  "org.scalablytyped" %%% "d3-hierarchy" % "2.0-dt-20200929Z-5d6b04",
  "org.scalablytyped" %%% "d3-interpolate" % "2.0-dt-20201001Z-aa67e8",
  "org.scalablytyped" %%% "d3-path" % "2.0-dt-20201002Z-6a8acd",
  "org.scalablytyped" %%% "d3-quadtree" % "2.0-dt-20200930Z-8fe629",
  "org.scalablytyped" %%% "d3-random" % "2.2-dt-20201002Z-4eddb2",
  "org.scalablytyped" %%% "d3-scale" % "3.2-dt-20201104Z-9eb583",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-a8cb53",
  "org.scalablytyped" %%% "d3-shape" % "2.0-dt-20201028Z-c8f145",
  "org.scalablytyped" %%% "d3-time" % "2.0-dt-20201002Z-54d48e",
  "org.scalablytyped" %%% "d3-time-format" % "3.0-dt-20201002Z-2d6d9a",
  "org.scalablytyped" %%% "d3-timer" % "2.0-dt-20201002Z-12514b",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-efca7d",
  "org.scalablytyped" %%% "d3-zoom" % "2.0-dt-20201104Z-c4b70c",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20201002Z-2461bc",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
