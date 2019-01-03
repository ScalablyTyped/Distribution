organization := "org.scalablytyped"
name := "mongoose-deep-populate"
version := "2.0.3-dt-20180214Z-47bb55"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-47f88b",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181223Z-9610e2",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20181231Z-9f0841",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        