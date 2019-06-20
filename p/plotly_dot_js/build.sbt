organization := "org.scalablytyped"
name := "plotly_dot_js"
version := "1.44-dt-20190612Z-2508f0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-822158",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-b24979",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-c905df",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-6fec75",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-118751",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-828f81",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-b6a1b4",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-925bf2",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-65ddbd",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-8f1d1b",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-56cdfd",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-54c918",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-362cc6",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-54f0bf",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-c91f4e",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-65a2c4",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-646c38",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-272bb1",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-dc6420",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-35d8fc",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-f51f62",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-058182",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-3080d7",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-296113",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-3085c7",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-6ffed1",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-273e84",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-d265ec",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-5c5531",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        