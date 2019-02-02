organization := "org.scalablytyped"
name := "multer-s3"
version := "2.7-dt-20180425Z-96f79d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.395.0-f8a05a",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e2423e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-99e619",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-2e86e4",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-3f958a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-d79c77",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-88440d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-5089c8",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20180607Z-c28fc3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-145d73",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-fdcda0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ff7651",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-dbdaa1",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-d55f12")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        