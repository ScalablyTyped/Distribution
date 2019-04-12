organization := "org.scalablytyped"
name := "multer-s3"
version := "2.7-dt-20180425Z-b315a9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.437.0-38b3ff",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-d1ac4d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-751003",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-3a85ce",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-6ba758",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-92341b",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-00ea77",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20190326Z-cf250e",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20190322Z-4d289d",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-84d26d",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-e88380",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20190402Z-64b74b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        