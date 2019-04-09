organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-35b352"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20190322Z-a7c0f4",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-9bd20f",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-1a4c4a",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-4987a8",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-8cca44",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-8bc7ea",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-5e1db5",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-2b0048",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-32e430",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20190322Z-73d485",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20190322Z-8e3fb4")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        