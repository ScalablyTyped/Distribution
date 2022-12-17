organization := "org.scalablytyped"
name := "popoto"
version := "3.0-dt-20211202Z-9e7888"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3" % "7.4-dt-20221103Z-efba31",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20220624Z-60a2c3",
  "org.scalablytyped" %%% "d3-axis" % "3.0-dt-20220624Z-64110d",
  "org.scalablytyped" %%% "d3-brush" % "3.0-dt-20211202Z-3ab924",
  "org.scalablytyped" %%% "d3-chord" % "3.0-dt-20211202Z-5ee5db",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-8f9158",
  "org.scalablytyped" %%% "d3-contour" % "3.0-dt-20211202Z-cb145c",
  "org.scalablytyped" %%% "d3-delaunay" % "6.0-dt-20220524Z-91770d",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20220624Z-f57d51",
  "org.scalablytyped" %%% "d3-drag" % "3.0-dt-20211202Z-1e7472",
  "org.scalablytyped" %%% "d3-dsv" % "3.0-dt-20220819Z-1c9a6d",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-e4e0f4",
  "org.scalablytyped" %%% "d3-fetch" % "3.0-dt-20220624Z-b3a006",
  "org.scalablytyped" %%% "d3-force" % "3.0-dt-20211202Z-c4ebf7",
  "org.scalablytyped" %%% "d3-format" % "3.0-dt-20211202Z-00bc15",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20211202Z-a715b6",
  "org.scalablytyped" %%% "d3-hierarchy" % "3.1-dt-20220624Z-1725dc",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-76c8b7",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-1117bb",
  "org.scalablytyped" %%% "d3-quadtree" % "3.0-dt-20220624Z-be0431",
  "org.scalablytyped" %%% "d3-random" % "3.0-dt-20211202Z-17dfe8",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-a52588",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-07c147",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-3978d5",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-6f203c",
  "org.scalablytyped" %%% "d3-time-format" % "4.0-dt-20211202Z-636fbf",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-7b4003",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-a142cc",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20220624Z-010744",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-89d05a",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
