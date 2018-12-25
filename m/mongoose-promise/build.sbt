organization := "org.scalablytyped"
name := "mongoose-promise"
version := "4.5.4-dt-20180214Z-a6dca8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-d496ac",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181223Z-7d3e22",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20181210Z-945f29",
  "org.scalablytyped" %%% "mpromise" % "0.5.4-dt-20180214Z-6c5c41",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        