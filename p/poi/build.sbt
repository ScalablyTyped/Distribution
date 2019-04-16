organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-a5480a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-4b6b4d",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-58078f",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20190130Z-ced7f8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-b54bcb",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-647453",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-7a04b0",
  "org.scalablytyped" %%% "html-minifier" % "3.5-dt-20190212Z-42e373",
  "org.scalablytyped" %%% "html-webpack-plugin" % "3.2-dt-20181121Z-7dfc00",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20190301Z-c97353",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20190114Z-3ec684",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-28d4e0",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "relateurl" % "v0.2.6-dt-20190322Z-8b29e0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-4dbd53",
  "org.scalablytyped" %%% "source-map" % "0.7.3-3d82c0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20190322Z-f8c6f2",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-e5143c",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190411Z-ae8783",
  "org.scalablytyped" %%% "webpack-chain" % "5.2.4-5774a6",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.1-dt-20190330Z-f45888")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        