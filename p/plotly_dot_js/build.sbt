organization := "org.scalablytyped"
name := "plotly_dot_js"
version := "1.44-dt-20200210Z-56b3df"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-cad5be",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-19e42d",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-ab0e32",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-850247",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-7f3bf8",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-1e0503",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-7f17e7",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-ddaec4",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-9d163e",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-03e9e7",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20191014Z-fb6601",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-4f1c30",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-a75c6e",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-bd5686",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-fbb279",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-84ebbb",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-ab650c",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-b9e76a",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-a77e29",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-79f1e4",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-6e1147",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-b64d3b",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-62c6b9",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-fff2f5",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-126f08",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200129Z-cfa841",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-854237",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-d6a87e",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-7de14c",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
