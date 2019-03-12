organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-8eb6b8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-78d9fc",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180214Z-144ca7",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180214Z-b08061",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180214Z-273b1b",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180214Z-b5ce4c",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-05522e",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190311Z-8b4969",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180214Z-fdaac2",
  "org.scalablytyped" %%% "readable-stream" % "2.3-dt-20190227Z-8e905e",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-696ff5",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180214Z-9a2e52",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180214Z-a6e46b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        