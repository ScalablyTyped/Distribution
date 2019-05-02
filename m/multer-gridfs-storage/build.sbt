organization := "org.scalablytyped"
name := "multer-gridfs-storage"
version := "3.1-dt-20181020Z-c0f412"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-cbed34",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-7ceee1",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-39eb3a",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-ca686a",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-2fca98",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-7c1445",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190501Z-a23da1",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190426Z-c99721",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20190326Z-83f2e4",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-565137",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-75052f",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        