organization := "org.scalablytyped"
name := "nivo__line"
version := "0.55.0-705992"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-431253",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20190212Z-8ede05",
  "org.scalablytyped" %%% "d3-format" % "1.3-dt-20190212Z-7117ae",
  "org.scalablytyped" %%% "d3-hierarchy" % "1.1-dt-20190212Z-ce6a13",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20190212Z-bc1efa",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-38121a",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-825ab7",
  "org.scalablytyped" %%% "d3-scale-chromatic" % "1.3-dt-20190212Z-7cc38f",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-a59bb2",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-d8b54d",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-ec0764",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190329Z-69a948",
  "org.scalablytyped" %%% "nivo__axes" % "0.55.0-eba6bb",
  "org.scalablytyped" %%% "nivo__core" % "0.55.0-84e390",
  "org.scalablytyped" %%% "nivo__legends" % "0.55.0-402da3",
  "org.scalablytyped" %%% "nivo__scales" % "0.55.0-2c7410",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190329Z-407a4c",
  "org.scalablytyped" %%% "react-measure" % "2.0-dt-20190225Z-3c2845",
  "org.scalablytyped" %%% "react-motion" % "0.0-unknown-dt-20190322Z-772a5e",
  "org.scalablytyped" %%% "recompose" % "0.30-dt-20190322Z-feb316",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        