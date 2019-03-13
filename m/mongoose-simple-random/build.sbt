organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-dt-20180723Z-e78c36"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-1e09db",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190307Z-9e003f",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190312Z-31decf",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        