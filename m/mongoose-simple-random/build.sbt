organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-dt-20180723Z-b908c8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-4f8d8d",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190307Z-59ff8d",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190325Z-a5e8e9",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        