organization := "org.scalablytyped"
name := "popoto"
version := "3.0-dt-20211202Z-46d962"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3" % "7.4-dt-20221230Z-d3fd6a",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20221230Z-c69b17",
  "org.scalablytyped" %%% "d3-axis" % "3.0-dt-20230328Z-2a7905",
  "org.scalablytyped" %%% "d3-brush" % "3.0-dt-20221230Z-7eaadb",
  "org.scalablytyped" %%% "d3-chord" % "3.0-dt-20221230Z-443163",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-420d23",
  "org.scalablytyped" %%% "d3-contour" % "3.0-dt-20221230Z-e12bee",
  "org.scalablytyped" %%% "d3-delaunay" % "6.0-dt-20220524Z-4fb11c",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20221230Z-385727",
  "org.scalablytyped" %%% "d3-drag" % "3.0-dt-20221230Z-167d49",
  "org.scalablytyped" %%% "d3-dsv" % "3.0-dt-20221230Z-151a85",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-e4e0f4",
  "org.scalablytyped" %%% "d3-fetch" % "3.0-dt-20221230Z-9a8092",
  "org.scalablytyped" %%% "d3-force" % "3.0-dt-20221230Z-206870",
  "org.scalablytyped" %%% "d3-format" % "3.0-dt-20211202Z-a72c85",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20221230Z-68e43c",
  "org.scalablytyped" %%% "d3-hierarchy" % "3.1-dt-20230126Z-385a22",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20221230Z-fec0d7",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-1117bb",
  "org.scalablytyped" %%% "d3-quadtree" % "3.0-dt-20221230Z-976fa1",
  "org.scalablytyped" %%% "d3-random" % "3.0-dt-20211202Z-e7643d",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20230328Z-6525b9",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20230317Z-7acbb7",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20221230Z-fce24b",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-f00c5f",
  "org.scalablytyped" %%% "d3-time-format" % "4.0-dt-20211202Z-e3ef09",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-7b4003",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20221230Z-c1624f",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20221230Z-ddd74c",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-852eb7",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
