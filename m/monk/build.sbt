organization := "org.scalablytyped"
name := "monk"
version := "6.0.6-349f05"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-0a850a",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-315ade",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-cd82dc",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180214Z-f0cd02",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        