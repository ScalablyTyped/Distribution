organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-86deb3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-7ebb01",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-656bcf",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-1f2390",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-ad316e",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-9fc7e9",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-686ff4",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-d24306",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-4b5ba6",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-dbae89",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-4624cc",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-e11874")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        