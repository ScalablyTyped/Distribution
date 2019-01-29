organization := "org.scalablytyped"
name := "mongoose-paginate-v2"
version := "1.0-dt-20190107Z-f75ec8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-b4a32f",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-e022a2",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190121Z-9a600e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        