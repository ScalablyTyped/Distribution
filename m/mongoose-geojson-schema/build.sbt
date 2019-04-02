organization := "org.scalablytyped"
name := "mongoose-geojson-schema"
version := "2.1-dt-20180214Z-640086"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-b53f76",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190307Z-fa9803",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190326Z-c04313",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        