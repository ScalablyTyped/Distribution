organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181022Z-9a9c71"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-42a8d7",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-ab0cf8",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-6e71a0",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-31233f",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-c1e1a0",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-f15153",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-3db512",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190122Z-aac9d7",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190212Z-f9010a",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190212Z-f90893",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-840406",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-43358d",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190212Z-d23d37",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-f7b0f5",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-e34fff",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190131Z-d55fa8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1dd39e",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-9ef634",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-385173",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-5dab68",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-1e193b",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-9be8ed",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-036772",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        