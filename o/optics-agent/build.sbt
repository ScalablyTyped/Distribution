organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20190826Z-84d921"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-7abcc9",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-8ff114",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-a8883d",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-9bb8d3",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-090bd5",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-26f1f7",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-915bef",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-48acfb",
  "org.scalablytyped" %%% "graphql" % "14.5.4-73f550",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-968bbe",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-3da7e8",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-aeaeee",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-9360b6",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-f7b87a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-612693",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-2b791f",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-fef82d",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190911Z-da4655",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-77c72d",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-db4fa8",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-4181d6",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-018fb5",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        