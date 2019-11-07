organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20190826Z-528883"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-1eaf82",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-8e8c0f",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-5c1264",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-5479a7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-34724c",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-e0ceed",
  "org.scalablytyped" %%% "express" % "4.17-dt-20191101Z-561191",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20191101Z-51a4ff",
  "org.scalablytyped" %%% "graphql" % "14.5.8-bafd12",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20191105Z-b89345",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-0138f4",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20191101Z-6c76f1",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-215745",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20191016Z-c91c81",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-301fe0",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-c223ab",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-7afbb3",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191105Z-2397f3",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-ae0e0c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ebcbf",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-cc63ce",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-89d1d8",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        