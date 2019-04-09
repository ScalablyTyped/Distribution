organization := "org.scalablytyped"
name := "nivo__voronoi"
version := "0.55.0-694661"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-8ede05",
  "org.scalablytyped" %%% "d3-delaunay" % "4.1-dt-20180910Z-bc35c6",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-7117ae",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-ce6a13",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-bc1efa",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-38121a",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-825ab7",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20190212Z-7cc38f",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-a59bb2",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-d8b54d",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-ec0764",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "nivo__core" % "0.55.0-aaade4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190403Z-3351b3",
  "org.scalablytyped" %%% "react-measure" % "2.0-dt-20190225Z-f529f1",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20190322Z-f6d272",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190322Z-31c3a3",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        