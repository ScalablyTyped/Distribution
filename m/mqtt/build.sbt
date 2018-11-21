organization := "com.scalablytyped"
name := "mqtt"
version := "2.18.8-71fff6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "bl" % "v2.1.0-dt-20181010Z-2a416f",
  "com.scalablytyped" %%% "concat-stream" % "1.6-dt-20180910Z-483dcb",
  "com.scalablytyped" %%% "end-of-stream" % "1.4-dt-20180910Z-655a11",
  "com.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20180910Z-342763",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-dd566d",
  "com.scalablytyped" %%% "mqtt-packet" % "5.6.0-695cf8",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "pump" % "1.0-dt-20180910Z-817f78",
  "com.scalablytyped" %%% "safe-buffer" % "5.1.2-af9cee",
  "com.scalablytyped" %%% "split2" % "2.1.0-dt-20180910Z-6c9523",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "xtend" % "4.0.1-dt-20180910Z-a53ca1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        