organization := "org.scalablytyped"
name := "multer-gridfs-storage"
version := "4.0-dt-20191104Z-f720d3"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-f1cf1e",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20191119Z-5970e3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-0a9c38",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-b0737f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-941e8c",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e32d86",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191223Z-70f989",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20200109Z-1c344b",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20190925Z-2257b8",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200115Z-14f523",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-166e61",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-949d85",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        