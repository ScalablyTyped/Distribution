organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181022Z-da2f00"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-81e1d4",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-192d3d",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181116Z-62c842",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-b66195",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-042dbc",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-24452b",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190604Z-64fa08",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190606Z-c03427",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190624Z-c591ae",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-4aa847",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-a6af0c",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-332cbb",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-271e7b",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-3b34b7",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20190522Z-1188af",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-1c84be",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-a40537",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-c70aeb",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-2f0000",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-f16918",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-d6a4d1",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-b4e173",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        