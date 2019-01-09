organization := "org.scalablytyped"
name := "postcss-calc"
version := "7.0-dt-20181101Z-9a977a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-1b78a1",
  "org.scalablytyped" %%% "chalk" % "2.4.2-38684c",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-58487f",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-ec7424",
  "org.scalablytyped" %%% "js-base64" % "2.3-dt-20180214Z-80aedd",
  "org.scalablytyped" %%% "postcss" % "5.2.18-20982a",
  "org.scalablytyped" %%% "source-map" % "0.7.3-8fe344",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-729b1c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        