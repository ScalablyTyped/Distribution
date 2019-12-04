organization := "org.scalablytyped"
name := "plotly_dot_js"
version := "1.44-dt-20191126Z-837070"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-3437df",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-cf2255",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-4d98db",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-6c205f",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-324cff",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-a559ed",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-73e356",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-cf8c57",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-ae34aa",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-96ef86",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20191014Z-a6ea45",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-0d7f0d",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-c044c5",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-f9cfb2",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-6f2f9b",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-8560c7",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-1ca699",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-cd2d13",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-f0ec27",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-648359",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-db38c1",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-06ce6e",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-16041b",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-9fb774",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-dbab0e",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-3df0c6",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-6f69df",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-74daf3",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-f488cd",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        