organization := "org.scalablytyped"
name := "postcss-url"
version := "8.0-dt-20181130Z-15f5ae"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-25ff53",
  "org.scalablytyped" %%% "chalk" % "2.4.1-b06515",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-a35d04",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-4eeb6b",
  "org.scalablytyped" %%% "js-base64" % "2.3-dt-20180214Z-f8e340",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "postcss" % "5.2.18-28525e",
  "org.scalablytyped" %%% "source-map" % "0.7.3-fc8207",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-a489b6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        