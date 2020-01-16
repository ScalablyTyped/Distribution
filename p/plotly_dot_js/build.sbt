organization := "org.scalablytyped"
name := "plotly_dot_js"
version := "1.44-dt-20200108Z-d92475"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-616286",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-9b24d5",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-554c6f",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-a50b4f",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-487c6e",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-2e36d3",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-b31308",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-1894e4",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-7a315c",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-5d6d39",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20191014Z-6c5a8a",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-637c29",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-61b1f3",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-a1910e",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-39e0dc",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-565c06",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-315940",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-9cfb23",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-f0ec27",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-b4dfe7",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-181e16",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-56dfe4",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-23ae4b",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-b61d97",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-b4618c",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-8c194d",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-abb8b2",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-4a0b1b",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-871c5b",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        