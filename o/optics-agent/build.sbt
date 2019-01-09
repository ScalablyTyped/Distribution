organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181022Z-7c3da1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-a76ae9",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-07367a",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-81bdfb",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181111Z-5f4ff6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180417Z-2e760b",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180214Z-174a7c",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180603Z-b9978d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180604Z-afbe4d",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-0934bb",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181212Z-62949f",
  "org.scalablytyped" %%% "http-assert" % "1.4-dt-20181225Z-89a1a3",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-8bacc5",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181211Z-90d510",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-92f676",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181231Z-a83ef9",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180214Z-1ca86a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180214Z-b17d95",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180214Z-d60f14",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180214Z-d57943",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180214Z-495653",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-13d69c",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180428Z-3abc85",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-836fbb",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        