organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181022Z-aa5af9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-cbfc67",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-756d43",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-f53c96",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181111Z-1ae318",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-7c4262",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-f565c6",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-8f4d08",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-af1292",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-cb936f",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181212Z-7c2315",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-18ffc1",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-ed5fb2",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-7bcab6",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-43067a",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-51f4a6",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-7f96e5",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-6294fd",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-12a530",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-4f5984",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-adcb2b",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-d115b2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-91019c",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-f0e16c",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        