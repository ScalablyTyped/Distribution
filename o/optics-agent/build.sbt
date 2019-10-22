organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20190826Z-adcf57"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-ad672f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-9a4c55",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-210d99",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-b970ae",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-0179d8",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-1eaf8b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-7c2aeb",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191015Z-a10e25",
  "org.scalablytyped" %%% "graphql" % "14.5.8-9a82b3",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191014Z-97681f",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-eee525",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-c7c4ce",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191016Z-edb551",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-7db5f5",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-1cc445",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191021Z-a8dc6e",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-281e7e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-3a858a",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-2d8697",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        