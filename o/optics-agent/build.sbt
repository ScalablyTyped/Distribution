organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20190826Z-5768b5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-cbb841",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-23cf38",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-aa101c",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-6b2b90",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-003b73",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-9c55c1",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-e86cd1",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-f5dd1c",
  "org.scalablytyped" %%% "graphql" % "14.5.8-216385",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191115Z-069ef0",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-e6186e",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-71d4bf",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-e35051",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-7c9dce",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-e32d86",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-55b31a",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-3bdf23",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-b9f880",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-0dcaae",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-166e61",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-454481",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-80299b",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        