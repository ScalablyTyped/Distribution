organization := "org.scalablytyped"
name := "node-red-node-test-helper"
version := "0.2-dt-20200925Z-354f1f"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ace" % "0.0-unknown-dt-20201013Z-ed84a2",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-0ef592",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-4b695b",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20201014Z-85cccd",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20201010Z-7e699c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-2f63a9",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-2cc92e",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20201028Z-b9c3f6",
  "org.scalablytyped" %%% "jsonata" % "1.8.4-07012f",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-35349b",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "node-red" % "1.1-dt-20200925Z-707eef",
  "org.scalablytyped" %%% "node-red__editor-api" % "1.1-dt-20200925Z-e2ab8f",
  "org.scalablytyped" %%% "node-red__editor-client" % "1.1-dt-20201028Z-13d8fe",
  "org.scalablytyped" %%% "node-red__registry" % "1.1-dt-20200925Z-05f8d1",
  "org.scalablytyped" %%% "node-red__runtime" % "1.1-dt-20201028Z-439645",
  "org.scalablytyped" %%% "node-red__util" % "1.1-dt-20200925Z-d23bc5",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20201112Z-1d24bc",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-42be7a",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-f5b664",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-f95694",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-027e10",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-85a80d",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20201002Z-27ba00",
  "org.scalablytyped" %%% "std" % "4.1-044efb",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20200825Z-5c14e7",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20201002Z-f51f5b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
