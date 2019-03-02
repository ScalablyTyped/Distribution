organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-24074f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-8501a1",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-64cdac",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-2fa4ac",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-3e5cb5",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-e2a650",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-6f0cbb",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-bc2d7c",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-0e0473",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-a4554d",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-6bed81",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-796f9f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        