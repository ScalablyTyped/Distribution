organization := "org.scalablytyped"
name := "multer-s3"
version := "2.7-dt-20180425Z-0bc68e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.424.0-6722a1",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-645745",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-ac6a7b",
  "org.scalablytyped" %%% "buffer" % "5.2.1-c7b8d7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-9339aa",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-a6b9cb",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-6d51ab",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-0c8bec",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-f324c8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-fcf6a3",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20180607Z-de89b7",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-5082d0",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-0f14ab",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-2a152d",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-9461ae",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-15f2af")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        