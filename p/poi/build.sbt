organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-2bb279"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-4b6b4d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-eda7b1",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-3de26c",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-28d2d3",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-c7cba5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-10584a",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-16e0da",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-7d83b3",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-889105",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-fbb3d4",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190417Z-002402",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-8b29e0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-82bdb8",
  "org.scalablytyped" %%% "source-map" % "0.7.3-3d82c0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f8c6f2",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e5143c",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190411Z-278dfd",
  "org.scalablytyped" %%% "webpack-chain" % "5.2.4-e2c061",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190330Z-cce993")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        