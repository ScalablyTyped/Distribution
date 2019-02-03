organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-6b2e0e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-3ded33",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-201cb5",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-41a3e8",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-a36cd2",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-c025e6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-ac7fa5",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20181231Z-63b3a0",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-6dca96",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-de1398",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-e11874")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        