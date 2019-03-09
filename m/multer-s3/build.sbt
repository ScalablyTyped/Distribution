organization := "org.scalablytyped"
name := "multer-s3"
version := "2.7-dt-20180425Z-29b0dc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.418.0-7e0e5d",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-c05865",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-c60c6c",
  "org.scalablytyped" %%% "buffer" % "5.2.1-ef8f8f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-a449b6",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-585ca8",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-48f106",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-deeb53",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-eb5e01",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-5cf9d4",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20180607Z-c0fa5f",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-aeafd9",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-e47fea",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-78bbd1",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-49c2de",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-c3f585")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        