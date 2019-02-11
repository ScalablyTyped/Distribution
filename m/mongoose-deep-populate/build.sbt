organization := "org.scalablytyped"
name := "mongoose-deep-populate"
version := "2.0.3-dt-20180214Z-cd1711"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-92bfcc",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-90eecc",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190131Z-7ca3db",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        