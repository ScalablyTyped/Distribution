organization := "org.scalablytyped"
name := "mongoose-unique-validator"
version := "1.0-dt-20180214Z-3aa9a5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-a2e4d8",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-553fa0",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190121Z-754396",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        