organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20190823Z-3355eb"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-fe708f",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-234f40",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20190805Z-abd1a2",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20190219Z-2cac09",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8f9eda",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20190420Z-a81a50",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-79dfe3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-3d1b1f",
  "org.scalablytyped" %%% "graphql" % "14.5.3-be513a",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20190426Z-3bc36d",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180214Z-ecf77c",
  "org.scalablytyped" %%% "joi" % "14.3-dt-20190414Z-57592b",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180214Z-2d2be7",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20190701Z-21a720",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-c877f7",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20190322Z-05dd4d",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20190322Z-39cfe3",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190820Z-2dc4df",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20190322Z-9ec145",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b87c0a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-6da2a4",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-d5fbf2",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        