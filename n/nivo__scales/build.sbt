organization := "org.scalablytyped"
name := "nivo__scales"
version := "0.55.0-2c7410"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "d3-scale" % "2.1-dt-20190212Z-825ab7",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-d8b54d",
  "org.scalablytyped" %%% "d3-time-format" % "2.1-dt-20190212Z-ec0764",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190329Z-69a948",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f7ff2b",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        