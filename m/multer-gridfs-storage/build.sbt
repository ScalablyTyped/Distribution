organization := "org.scalablytyped"
name := "multer-gridfs-storage"
version := "3.1-dt-20181020Z-b3707e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-34f287",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-b4a32f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-202759",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-0c8b00",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-cd70e8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-2342ad",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-e022a2",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190121Z-9a600e",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20180607Z-76438b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a57469",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-22f3a9",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        