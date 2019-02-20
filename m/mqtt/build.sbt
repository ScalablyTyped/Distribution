organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-e1d2cd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-0a65f7",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-27dec7",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-0c73ed",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-9ac1db",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-83146b",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-a39874",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-ee2b7e",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-77ecd6",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-27ba81",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-e11874")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        