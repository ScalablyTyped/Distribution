organization := "org.scalablytyped"
name := "plotly_dot_js"
version := "1.44-dt-20191120Z-57244a"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-603dd4",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-0d45f3",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-f69c4b",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-bd9d4c",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-9060ec",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-b60124",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-2be275",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-a378e6",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-46be9f",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-dfc4fd",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20191014Z-0af37c",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-6cd578",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-cb4f81",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-ebe5d8",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-f600ea",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-188f34",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-5a8320",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-8ed7bc",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-88af92",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-0d71dd",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-9db9f1",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-eb0cf8",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-aed162",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-69269a",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-7eb029",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-d8076b",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-07c249",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-3e31b8",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-a51fd7",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        