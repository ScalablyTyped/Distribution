organization := "org.scalablytyped"
name := "plottable"
version := "3.8.3-896b30"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.0-dt-20181018Z-28e486",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20181018Z-7c4d6e",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20180927Z-66e7e4",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20181206Z-fccb78",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20181116Z-ec7407",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20180910Z-8c941a",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180910Z-d33cfb",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20181105Z-29a7b8",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20180910Z-a7d850",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20181206Z-b5b602",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20181116Z-6188f9",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180910Z-472a01",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181116Z-b81605",
  "org.scalablytyped" %%% "d3-force" % "1.1-dt-20180910Z-e81aba",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20180910Z-7a0d9c",
  "org.scalablytyped" %%% "d3-geo" % "1.10-dt-20180910Z-b36145",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20180910Z-d01774",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180927Z-a09bc5",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20180910Z-2d57fa",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20180910Z-83ced7",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20180918Z-d58a3b",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20180910Z-b88c86",
  "org.scalablytyped" %%% "d3-scale" % "2.0-dt-20180927Z-9e5424",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20180920Z-2e874a",
  "org.scalablytyped" %%% "d3-selection" % "1.3-dt-20181206Z-560b20",
  "org.scalablytyped" %%% "d3-shape" % "1.2-dt-20181213Z-c64ebc",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20180918Z-6f1ea1",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20180910Z-6fa62a",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180918Z-801ca7",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20181116Z-c9d739",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20180910Z-d9b5ba",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20181213Z-f59893",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20180910Z-04a914",
  "org.scalablytyped" %%% "is-plain-object" % "2.0.4-4e2273",
  "org.scalablytyped" %%% "isobject" % "3.0.1-391574",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "tslib" % "1.9.3-13238d",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-0fe740")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        