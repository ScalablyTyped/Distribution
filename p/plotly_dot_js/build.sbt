organization := "org.scalablytyped"
name := "plotly_dot_js"
version := "1.54-dt-20201028Z-7fad5e"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "d3" % "6.2-dt-20201118Z-222bdf",
  "org.scalablytyped" %%% "d3-array" % "2.8-dt-20201116Z-bfcf93",
  "org.scalablytyped" %%% "d3-axis" % "2.0-dt-20201104Z-a0aa4c",
  "org.scalablytyped" %%% "d3-brush" % "2.1-dt-20200930Z-67b03f",
  "org.scalablytyped" %%% "d3-chord" % "2.0-dt-20200929Z-d0b525",
  "org.scalablytyped" %%% "d3-color" % "2.0-dt-20201117Z-b3fe4c",
  "org.scalablytyped" %%% "d3-contour" % "2.0-dt-20200930Z-6de8c4",
  "org.scalablytyped" %%% "d3-delaunay" % "5.3-dt-20200930Z-313e48",
  "org.scalablytyped" %%% "d3-dispatch" % "2.0-dt-20200930Z-e0ec82",
  "org.scalablytyped" %%% "d3-drag" % "2.0-dt-20201028Z-2574ff",
  "org.scalablytyped" %%% "d3-dsv" % "2.0-dt-20201001Z-b6baad",
  "org.scalablytyped" %%% "d3-ease" % "2.0-dt-20200930Z-1567a4",
  "org.scalablytyped" %%% "d3-fetch" % "2.0-dt-20201001Z-56d841",
  "org.scalablytyped" %%% "d3-force" % "2.1-dt-20201002Z-394c2b",
  "org.scalablytyped" %%% "d3-format" % "2.0-dt-20200930Z-685f3e",
  "org.scalablytyped" %%% "d3-geo" % "2.0-dt-20201002Z-835234",
  "org.scalablytyped" %%% "d3-hierarchy" % "2.0-dt-20200929Z-11a1ea",
  "org.scalablytyped" %%% "d3-interpolate" % "2.0-dt-20201001Z-121073",
  "org.scalablytyped" %%% "d3-path" % "2.0-dt-20201002Z-f8c6f6",
  "org.scalablytyped" %%% "d3-quadtree" % "2.0-dt-20200930Z-4d3001",
  "org.scalablytyped" %%% "d3-random" % "2.2-dt-20201002Z-7b1002",
  "org.scalablytyped" %%% "d3-scale" % "3.2-dt-20201104Z-3567e5",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-c00acc",
  "org.scalablytyped" %%% "d3-shape" % "2.0-dt-20201028Z-44996d",
  "org.scalablytyped" %%% "d3-time" % "2.0-dt-20201002Z-9a0554",
  "org.scalablytyped" %%% "d3-time-format" % "3.0-dt-20201002Z-74408e",
  "org.scalablytyped" %%% "d3-timer" % "2.0-dt-20201002Z-3ffd74",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-fcabd1",
  "org.scalablytyped" %%% "d3-zoom" % "2.0-dt-20201104Z-3dcb5d",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20201002Z-9fb8ea",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
