organization := "org.scalablytyped"
name := "popoto"
version := "3.0-dt-20211202Z-1efddc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3" % "7.4-dt-20220913Z-d9403d",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20220624Z-6e7330",
  "org.scalablytyped" %%% "d3-axis" % "3.0-dt-20220624Z-8c640a",
  "org.scalablytyped" %%% "d3-brush" % "3.0-dt-20211202Z-78c474",
  "org.scalablytyped" %%% "d3-chord" % "3.0-dt-20211202Z-8976a8",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-20258d",
  "org.scalablytyped" %%% "d3-contour" % "3.0-dt-20211202Z-49965a",
  "org.scalablytyped" %%% "d3-delaunay" % "6.0-dt-20220524Z-bd2948",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20220624Z-016a0f",
  "org.scalablytyped" %%% "d3-drag" % "3.0-dt-20211202Z-d8d62a",
  "org.scalablytyped" %%% "d3-dsv" % "3.0-dt-20220819Z-a19e1f",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-b88c1a",
  "org.scalablytyped" %%% "d3-fetch" % "3.0-dt-20220624Z-c8476d",
  "org.scalablytyped" %%% "d3-force" % "3.0-dt-20211202Z-691b7f",
  "org.scalablytyped" %%% "d3-format" % "3.0-dt-20211202Z-e729d6",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20211202Z-68870c",
  "org.scalablytyped" %%% "d3-hierarchy" % "3.1-dt-20220624Z-62102c",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-d7f73c",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-97e717",
  "org.scalablytyped" %%% "d3-quadtree" % "3.0-dt-20220624Z-2fee51",
  "org.scalablytyped" %%% "d3-random" % "3.0-dt-20211202Z-36dbc9",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-bb7662",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-5af29b",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-2f39ea",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-94b19b",
  "org.scalablytyped" %%% "d3-time-format" % "4.0-dt-20211202Z-0a7471",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-0f32a8",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-acda78",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20220624Z-d8c4d0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-fa1356",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
