organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-202c30"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-131d9b",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-f43a18",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-e7f5f0",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-e6818b",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-54b1d3",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-0ad955",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-3fb0a9",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-967cc2",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-dbd0d6",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-e2f6a1",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-7d2b3e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        