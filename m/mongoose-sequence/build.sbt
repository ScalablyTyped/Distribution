organization := "org.scalablytyped"
name := "mongoose-sequence"
version := "3.0.2-dt-20180214Z-0dd1e1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-c5ebe0",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190307Z-123dda",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190313Z-09b61d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        