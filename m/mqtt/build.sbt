organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-615651"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-d8e637",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-0f5dc8",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-ea8deb",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-64b0c3",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-b5ce4c",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-e04614",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-448200",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-1c8cf8",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-994550",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-4bf787",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-a6e46b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        