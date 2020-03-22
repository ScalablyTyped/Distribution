organization := "org.scalablytyped"
name := "plotly_dot_js"
version := "1.44-dt-20200210Z-194473"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-f441a9",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-f61553",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-1342fd",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-038e2f",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-d29c36",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-ea946c",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-e9695f",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-cbd695",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-c6c192",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-34e806",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20191014Z-fb6601",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20181228Z-23be0d",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-68ef08",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-239a4c",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-2eed86",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-edb7b1",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-eef537",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-ab650c",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-7c08a5",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-a77e29",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-1a4e83",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-35059d",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-a31c9d",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-47ca5e",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-75397f",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-126f08",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200129Z-0c20be",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-572ced",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-d1608e",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-67022f",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
