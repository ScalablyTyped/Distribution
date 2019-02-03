organization := "org.scalablytyped"
name := "mongoose-unique-validator"
version := "1.0-dt-20180214Z-a91e30"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-141ca5",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-c008a8",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190131Z-d790ca",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        