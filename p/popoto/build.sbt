organization := "org.scalablytyped"
name := "popoto"
version := "3.0-dt-20211202Z-5a5922"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3" % "7.4-dt-20221103Z-2ba765",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20220624Z-32db41",
  "org.scalablytyped" %%% "d3-axis" % "3.0-dt-20220624Z-d10c91",
  "org.scalablytyped" %%% "d3-brush" % "3.0-dt-20211202Z-3831b4",
  "org.scalablytyped" %%% "d3-chord" % "3.0-dt-20211202Z-e64c37",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-7b411a",
  "org.scalablytyped" %%% "d3-contour" % "3.0-dt-20211202Z-73e5ee",
  "org.scalablytyped" %%% "d3-delaunay" % "6.0-dt-20220524Z-90dc9f",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20220624Z-37057f",
  "org.scalablytyped" %%% "d3-drag" % "3.0-dt-20211202Z-4338f8",
  "org.scalablytyped" %%% "d3-dsv" % "3.0-dt-20220819Z-0b5f56",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-e4e0f4",
  "org.scalablytyped" %%% "d3-fetch" % "3.0-dt-20220624Z-564cb4",
  "org.scalablytyped" %%% "d3-force" % "3.0-dt-20211202Z-56ae65",
  "org.scalablytyped" %%% "d3-format" % "3.0-dt-20211202Z-dabccb",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20211202Z-084e9a",
  "org.scalablytyped" %%% "d3-hierarchy" % "3.1-dt-20220624Z-b26902",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-903c07",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-1117bb",
  "org.scalablytyped" %%% "d3-quadtree" % "3.0-dt-20220624Z-fd8170",
  "org.scalablytyped" %%% "d3-random" % "3.0-dt-20211202Z-e7643d",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-a0ef46",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-cb99f3",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-47ca74",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-72901b",
  "org.scalablytyped" %%% "d3-time-format" % "4.0-dt-20211202Z-370ce5",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-7b4003",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-511bd1",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20220624Z-59b3a8",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-12a811",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
