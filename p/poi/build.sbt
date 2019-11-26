organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-6a43ea"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-84e0a0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-9b6106",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-cffe01",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-ec07f0",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20190819Z-923391",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-13b33a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191115Z-da006c",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-6dece6",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20190712Z-6949ba",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20191115Z-d8960b",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190819Z-e77abc",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-e84c0f",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191125Z-959704",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1b75dd",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-83f9dd",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-335844",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20190322Z-67a687",
  "org.scalablytyped" %%% "source-map" % "0.7.3-651620",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-7c63f1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-c659dd",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20191116Z-c3ae8f",
  "org.scalablytyped" %%% "webpack-chain" % "6.0.0-f8f44c",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.4-dt-20191022Z-adc9d8",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20180625Z-990cb1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        