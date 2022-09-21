organization := "org.scalablytyped"
name := "popoto"
version := "3.0-dt-20211202Z-dac560"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3" % "7.4-dt-20220913Z-cf98c8",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20220624Z-1a40ef",
  "org.scalablytyped" %%% "d3-axis" % "3.0-dt-20220624Z-1fa9f7",
  "org.scalablytyped" %%% "d3-brush" % "3.0-dt-20211202Z-aacd4b",
  "org.scalablytyped" %%% "d3-chord" % "3.0-dt-20211202Z-8da4ae",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-72e26c",
  "org.scalablytyped" %%% "d3-contour" % "3.0-dt-20211202Z-cd4b71",
  "org.scalablytyped" %%% "d3-delaunay" % "6.0-dt-20220524Z-67363b",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20220624Z-0d26e7",
  "org.scalablytyped" %%% "d3-drag" % "3.0-dt-20211202Z-2a65d5",
  "org.scalablytyped" %%% "d3-dsv" % "3.0-dt-20220819Z-e4d87a",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-b88c1a",
  "org.scalablytyped" %%% "d3-fetch" % "3.0-dt-20220624Z-e082c6",
  "org.scalablytyped" %%% "d3-force" % "3.0-dt-20211202Z-ca37d1",
  "org.scalablytyped" %%% "d3-format" % "3.0-dt-20211202Z-8b6479",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20211202Z-a2b86e",
  "org.scalablytyped" %%% "d3-hierarchy" % "3.1-dt-20220624Z-d81f64",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-289c33",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-97e717",
  "org.scalablytyped" %%% "d3-quadtree" % "3.0-dt-20220624Z-dd9af3",
  "org.scalablytyped" %%% "d3-random" % "3.0-dt-20211202Z-36dbc9",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-604817",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-acb353",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-3bff61",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-b48dde",
  "org.scalablytyped" %%% "d3-time-format" % "4.0-dt-20211202Z-33fc79",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-0f32a8",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-4e2220",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20220624Z-ae5189",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-5d61ed",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
