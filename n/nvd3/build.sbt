organization := "org.scalablytyped"
name := "nvd3"
version := "1.8.1-dt-20190322Z-b0622f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3" % "5.7-dt-20190212Z-723312",
  "org.scalablytyped" %%% "d3-array" % "1.2-dt-20190221Z-7d8191",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-1838ae",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-6839ee",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-7552ca",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-a1298c",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-f5dffe",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-c79031",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-cc7277",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-6b2123",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190325Z-008742",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-a775d0",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-21141e",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-dabe78",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-e02417",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-b4f896",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-624282",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-28a917",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-d6de91",
  "org.scalablytyped" %%% "d3-polygon" % "1.0-dt-20190212Z-55a1e4",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-522c70",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-d13892",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-9a3781",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20190212Z-4a83b0",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-7ad803",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-8f7f62",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-b054b2",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-346e74",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-598a41",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-76417a",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-689bef",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-85b977",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-acd4df",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        