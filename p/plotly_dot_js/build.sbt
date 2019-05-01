organization := "org.scalablytyped"
name := "plotly_dot_js"
version := "1.44-dt-20190429Z-d11c4c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20190221Z-74cdf2",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20190212Z-c3c00e",
  "org.scalablytyped" %%% "d3-brush" % "1.0-dt-20190212Z-c39a7b",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20190212Z-799495",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-8c72b2",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-495528",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20190205Z-f2a372",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-d6b8fa",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20190212Z-026f99",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20190326Z-23a79f",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-c5c6cc",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20190212Z-9d89a5",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-b64ec9",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20190212Z-6ff5f7",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-f5eb05",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-d3dd5d",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-f6c341",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20190212Z-fb76b8",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20190212Z-279aee",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-079587",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-ac870b",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-1e3cff",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-d2c68c",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-d56646",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-5ec687",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-181257",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20190212Z-90b70d",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20190212Z-7e3e23",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-ed63b4",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        