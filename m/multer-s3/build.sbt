organization := "org.scalablytyped"
name := "multer-s3"
version := "2.7-dt-20190819Z-aad95d"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk" % "2.542.0-17483a",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-4a01ec",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-4ebaba",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-c5a083",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-7372e6",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "multer" % "1.3-dt-20190925Z-fe720b",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-c08138",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        