organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-20912f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20190322Z-a8c6ba",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-916594",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-a21672",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-320cd0",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20190322Z-b5ce4c",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-5c45ff",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-36ca8c",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-99190d",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-95714e",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20190322Z-c35b6a",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20190322Z-a6e46b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        