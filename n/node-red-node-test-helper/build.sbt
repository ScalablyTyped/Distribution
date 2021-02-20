organization := "org.scalablytyped"
name := "node-red-node-test-helper"
version := "0.2-dt-20200925Z-31b0e0"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "ace" % "0.0-unknown-dt-20201013Z-a3fd0b",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-210a9e",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-9b0b3f",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20201014Z-ba9607",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20201010Z-265976",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2a8190",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-49f0c4",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-ec453d",
  "org.scalablytyped" %%% "jsonata" % "1.8.4-a36bf6",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-901708",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-50d3d9",
  "org.scalablytyped" %%% "node-red" % "1.1-dt-20200925Z-061a8a",
  "org.scalablytyped" %%% "node-red__editor-api" % "1.1-dt-20200925Z-2177f0",
  "org.scalablytyped" %%% "node-red__editor-client" % "1.1-dt-20201028Z-769ee8",
  "org.scalablytyped" %%% "node-red__registry" % "1.1-dt-20200925Z-ebc4dd",
  "org.scalablytyped" %%% "node-red__runtime" % "1.1-dt-20201028Z-9d6e2b",
  "org.scalablytyped" %%% "node-red__util" % "1.1-dt-20200925Z-37ad24",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20201112Z-777a6f",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-f71cda",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-cf0dc0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-7640b4",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-bb1238",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-4689f3",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-ba78fd",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200825Z-1337a3",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20201002Z-9fad3b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
