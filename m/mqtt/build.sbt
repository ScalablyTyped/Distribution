organization := "com.scalablytyped"
name := "mqtt"
version := "2.18.8-36240c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-ca50db",
  "com.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-8b8dca",
  "com.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180910Z-e9592b",
  "com.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180910Z-733098",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-a475cc",
  "com.scalablytyped" %%% "mqtt-packet" % "5.6.0-857e64",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "pump" % "1.0-dt-20180910Z-b0fef9",
  "com.scalablytyped" %%% "safe-buffer" % "5.1.2-bd4e21",
  "com.scalablytyped" %%% "split2" % "2.1.0-dt-20180910Z-832706",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "xtend" % "4.0.1-dt-20180910Z-aeabf6",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        