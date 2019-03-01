organization := "org.scalablytyped"
name := "mongoose-geojson-schema"
version := "2.1-dt-20180214Z-09415b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-b837e2",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-222ecc",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190224Z-35d731",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        