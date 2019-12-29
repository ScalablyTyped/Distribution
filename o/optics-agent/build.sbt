organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20190826Z-39e8ff"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-894834",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-b0b0d9",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-9bfd31",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-3da977",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20191217Z-f02e41",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-a6e038",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-92e6db",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20191220Z-1ddd6d",
  "org.scalablytyped" %%% "graphql" % "14.5.8-8daf73",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191115Z-2e87f4",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-1b921f",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-158c1e",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-647d39",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20191127Z-76fdef",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-d3b7b2",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-a6d597",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-7fb15a",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-4c892f",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-a681e2",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-a1ed43",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-e023a3",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        