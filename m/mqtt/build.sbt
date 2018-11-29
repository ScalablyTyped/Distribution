organization := "com.scalablytyped"
name := "mqtt"
version := "2.18.8-cee6b7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-7c75f2",
  "com.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-15d5f3",
  "com.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180910Z-26df50",
  "com.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180910Z-b6f728",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-a475cc",
  "com.scalablytyped" %%% "mqtt-packet" % "5.6.0-2f377f",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "pump" % "1.0-dt-20180910Z-4b16f3",
  "com.scalablytyped" %%% "safe-buffer" % "5.1.2-47c488",
  "com.scalablytyped" %%% "split2" % "2.1.0-dt-20180910Z-e7d3cd",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "xtend" % "4.0.1-dt-20180910Z-aeabf6",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        