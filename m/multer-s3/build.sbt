organization := "org.scalablytyped"
name := "multer-s3"
version := "2.7-dt-20180425Z-2c11a9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.426.0-e3c47d",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-645745",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-c1f3cd",
  "org.scalablytyped" %%% "buffer" % "5.2.1-672aba",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-364e03",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-a6b9cb",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-4f0018",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-df1ad4",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-f324c8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20180607Z-2774d4",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190320Z-26b6b7",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-23aff6",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-c2acbe",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-ccdaec",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-c35435")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        