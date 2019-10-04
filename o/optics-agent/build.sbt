organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20190826Z-e54f94"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-4395cb",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-4a01ec",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-a8883d",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-9bb8d3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-4ebaba",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-fcc262",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-c5a083",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-7372e6",
  "org.scalablytyped" %%% "graphql" % "14.5.8-1773a0",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-8eca11",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-1673fc",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-aeaeee",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9360b6",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190925Z-5aac4e",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-2b791f",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-fef82d",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191003Z-e91184",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-77c72d",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-c08138",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-c80101",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        