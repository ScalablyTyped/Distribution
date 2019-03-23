organization := "org.scalablytyped"
name := "multer-s3"
version := "2.7-dt-20180425Z-d33de3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.427.0-31fc1f",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-645745",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-0c0785",
  "org.scalablytyped" %%% "buffer" % "5.2.1-7e3a15",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-729df7",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-a6b9cb",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-648fa1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-383ca3",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-f324c8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20180607Z-a0283c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190322Z-28a0c1",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20190322Z-1653e3",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-9383be",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-d1745b",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-e9549f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        