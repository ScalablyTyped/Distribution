organization := "org.scalablytyped"
name := "plotly_dot_js"
version := "1.50-dt-20200611Z-830f38"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-array" % "2.0-dt-20200515Z-eb3698",
  "org.scalablytyped" %%% "d3-axis" % "1.0-dt-20200515Z-32325d",
  "org.scalablytyped" %%% "d3-brush" % "1.1-dt-20200605Z-62465c",
  "org.scalablytyped" %%% "d3-chord" % "1.0-dt-20200515Z-1fc990",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20200515Z-9ade2c",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20200515Z-575632",
  "org.scalablytyped" %%% "d3-contour" % "1.3-dt-20200515Z-8bba20",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20200515Z-beaf34",
  "org.scalablytyped" %%% "d3-drag" % "1.2-dt-20200515Z-368c1d",
  "org.scalablytyped" %%% "d3-dsv" % "1.0-dt-20200515Z-23e0af",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20200515Z-f4b86b",
  "org.scalablytyped" %%% "d3-fetch" % "1.1-dt-20200515Z-624aa7",
  "org.scalablytyped" %%% "d3-force" % "1.2-dt-20200515Z-162b49",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20200515Z-32963b",
  "org.scalablytyped" %%% "d3-geo" % "1.11-dt-20200515Z-365bad",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20200515Z-cb6b91",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20200515Z-6a7e47",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20200515Z-80eb11",
  "org.scalablytyped" %%% "d3-quadtree" % "1.0-dt-20200515Z-3ed8d3",
  "org.scalablytyped" %%% "d3-random" % "1.1-dt-20200515Z-d1faa1",
  "org.scalablytyped" %%% "d3-scale" % "2.2-dt-20200515Z-bce035",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200515Z-edd1d8",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20200515Z-0df0ac",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20200515Z-e123ad",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20200515Z-14ee3e",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20200515Z-e0fb9b",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200515Z-2c7cce",
  "org.scalablytyped" %%% "d3-voronoi" % "1.1-dt-20200515Z-45a663",
  "org.scalablytyped" %%% "d3-zoom" % "1.7-dt-20200515Z-108ad1",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20200515Z-230004",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
