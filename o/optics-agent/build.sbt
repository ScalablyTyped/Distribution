organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181027Z-09ac2c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180910Z-5e1aa3",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-addcd5",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-678fe2",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-9fafc7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-564d85",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180910Z-e4e79e",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-50ee2c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-a97c36",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-6c0a30",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181214Z-db04f6",
  "org.scalablytyped" %%% "http-assert" % "1.3-dt-20181121Z-d4127c",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-1fc1dc",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181213Z-9b3760",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180910Z-22f4ec",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181120Z-23d243",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180910Z-c1542c",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-1d49f8",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-90fc20",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-66eb34",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-7ccab7",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-481dd9",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-eb00ce",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-878ba9",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        