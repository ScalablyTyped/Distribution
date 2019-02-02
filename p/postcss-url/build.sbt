organization := "org.scalablytyped"
name := "postcss-url"
version := "8.0-dt-20181130Z-1684f7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ansi-styles" % "3.2.1-dt-20181017Z-21090e",
  "org.scalablytyped" %%% "chalk" % "2.4.2-8e87c7",
  "org.scalablytyped" %%% "color-name" % "1.1-dt-20180214Z-de46de",
  "org.scalablytyped" %%% "escape-string-regexp" % "1.0-dt-20180721Z-98c322",
  "org.scalablytyped" %%% "js-base64" % "2.3-dt-20180214Z-05b360",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "postcss" % "5.2.18-9ce280",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4d6b96",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "supports-color" % "5.3-dt-20180409Z-efeb04")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        