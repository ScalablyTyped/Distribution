organization := "org.scalablytyped"
name := "mongoose-auto-increment"
version := "5.0.1-dt-20180214Z-7121dc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-87cf06",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181223Z-0d9d77",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190103Z-cd5800",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        