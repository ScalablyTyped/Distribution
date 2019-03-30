organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-7cc2bd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20190322Z-714673",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-b8125e",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-7298d3",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-b8b248",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-8cca44",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-cd687b",
  "org.scalablytyped" %%% "node" % "11.12-dt-20190330Z-e2b8de",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-dd737b",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-c565bc",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-195cbe",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20190322Z-940815",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20190322Z-8e3fb4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        