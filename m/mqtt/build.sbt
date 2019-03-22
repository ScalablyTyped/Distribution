organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-48e547"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-5f2cf7",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-dc0394",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-69f735",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-e3c3ed",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-b5ce4c",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-c3c0b9",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-a54f2b",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-334895",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-b5df74",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-561b46",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-a6e46b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        