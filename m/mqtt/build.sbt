organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-e7cb37"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-1d94b9",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-5c7068",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-ec695d",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-e07c6c",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-e2a650",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-a62daf",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-2bc3e6",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-c1b943",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-216e1b",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-7d91e4",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-796f9f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        