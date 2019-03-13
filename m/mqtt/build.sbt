organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-507df3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-b9aec4",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-56bbb3",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-2dba30",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-5c543f",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-b5ce4c",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-074248",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-e265b9",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-b635c8",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-fef2c2",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-7e13d0",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-a6e46b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        