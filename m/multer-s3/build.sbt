organization := "org.scalablytyped"
name := "multer-s3"
version := "2.7-dt-20180425Z-caea0a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.395.0-d616da",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-4a385a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-f52607",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-2e86e4",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-613b84",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-1d8801",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-88440d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-5089c8",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20180607Z-9a000c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-145d73",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-3ba963",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-146c83",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-29e273",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-3451e8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        