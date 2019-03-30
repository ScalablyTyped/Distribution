organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-dt-20180723Z-a1114d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-177348",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190307Z-b07b11",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190325Z-5a78d8",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        