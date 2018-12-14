organization := "org.scalablytyped"
name := "mqtt"
version := "2.18.8-89b419"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-e7f6d7",
  "org.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-29ee10",
  "org.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180910Z-1971e3",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180910Z-4e25bf",
  "org.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-aae1f0",
  "org.scalablytyped" %%% "mqtt-packet" % "5.6.0-d72483",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "pump" % "1.0-dt-20180910Z-9e1f94",
  "org.scalablytyped" %%% "safe-buffer" % "5.1.2-afe0f3",
  "org.scalablytyped" %%% "split2" % "2.1.0-dt-20180910Z-ca412d",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "xtend" % "4.0.1-dt-20180910Z-152227")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        