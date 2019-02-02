organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-885cbd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-5c9927",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-7a79e2",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-9bc5fa",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-ec7d9f",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-94b6ad",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-054f7d",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-bd75c8",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-ff4c21",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-5b89f7",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-451d85",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-d5ad12")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        