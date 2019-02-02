organization := "org.scalablytyped"
name := "multer-gridfs-storage"
version := "3.1-dt-20181020Z-f43d69"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-e2423e",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-4615b8",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-99e619",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-3f958a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-d79c77",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-5089c8",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-dbb2b3",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190131Z-632dde",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20180607Z-c28fc3",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-145d73",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-ff7651",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        