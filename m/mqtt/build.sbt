organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-09c662"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-f34cbd",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-d2b60d",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-62cef7",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-b0c19a",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-b5ce4c",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-451370",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-2b3ac5",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-0e4cac",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-6cf156",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-d29307",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-a6e46b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        