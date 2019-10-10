organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20190826Z-690542"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-93a6c5",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-aabbef",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-a9c90d",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-31857d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-db6ee1",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-88e72c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-3b7640",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-dff786",
  "org.scalablytyped" %%% "graphql" % "14.5.8-ae2a8e",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-95eb3d",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-13e7ff",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-22a7d7",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-6958e3",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190925Z-edb300",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-51ab0c",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-076342",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-c1978b",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-6c0f60",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-0d10b5",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-e134e0",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-3b5025",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        