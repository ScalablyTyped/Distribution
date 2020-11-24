organization := "org.scalablytyped"
name := "node-red-node-test-helper"
version := "0.2-dt-20200925Z-b519ce"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ace" % "0.0-unknown-dt-20201013Z-a8ea6f",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-7b4fa7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-931cf5",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20201014Z-1c136d",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20201010Z-7df0a0",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-c593b9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-c653a3",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-7fbb2b",
  "org.scalablytyped" %%% "jsonata" % "1.8.4-2e44f8",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-5d04c6",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "node-red" % "1.1-dt-20200925Z-18f0b1",
  "org.scalablytyped" %%% "node-red__editor-api" % "1.1-dt-20200925Z-f71f98",
  "org.scalablytyped" %%% "node-red__editor-client" % "1.1-dt-20201028Z-22fc9b",
  "org.scalablytyped" %%% "node-red__registry" % "1.1-dt-20200925Z-3aa352",
  "org.scalablytyped" %%% "node-red__runtime" % "1.1-dt-20201028Z-d7fdfb",
  "org.scalablytyped" %%% "node-red__util" % "1.1-dt-20200925Z-aa5884",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20201112Z-9c2376",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-dccf4c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-1cff6e",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-237e1c",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-292bea",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-800e51",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-12b933",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200825Z-c9c157",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20201002Z-6ee152")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
