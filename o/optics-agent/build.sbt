organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20190826Z-dc3134"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-1fdfc6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-a83d81",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-210d99",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-b970ae",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-e438a4",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-aba9d8",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-e44937",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-a3652a",
  "org.scalablytyped" %%% "graphql" % "14.5.8-9a82b3",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-6d65e8",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-d312c5",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-c7c4ce",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-1dd753",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190925Z-00121b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-8e1e66",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-7db5f5",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-1cc445",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-c62b25",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-281e7e",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c44ea2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-84f8ef",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-2c97b1",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        