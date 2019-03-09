organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-051a24"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-dd4060",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-423c52",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-e9ce70",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-370ba5",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-5de375",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-9fc95e",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-b7bdb0",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-1cc6bc",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-0aee39",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-7bcc6c",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-750ba0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        