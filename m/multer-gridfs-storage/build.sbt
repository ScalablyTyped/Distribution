organization := "org.scalablytyped"
name := "multer-gridfs-storage"
version := "3.1-dt-20181020Z-6286fe"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-9371e4",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-db4d7e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-d00fa7",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-eb949a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190524Z-ba44ed",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190515Z-950532",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20190524Z-4ca405",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20190326Z-6b9bb0",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190517Z-07594f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-c144dc",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        