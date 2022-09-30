organization := "org.scalablytyped"
name := "node-red-node-test-helper"
version := "0.2-dt-20220701Z-33e01c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ace" % "0.0-unknown-dt-20220818Z-3c7970",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-1122ee",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20211202Z-3b2b8e",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-646db4",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-53b851",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-894e6b",
  "org.scalablytyped" %%% "jsonata" % "1.8.6-123301",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-fb8f3f",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "node-red" % "1.2-dt-20220329Z-0f52df",
  "org.scalablytyped" %%% "node-red__editor-api" % "1.1-dt-20211202Z-9fdb64",
  "org.scalablytyped" %%% "node-red__editor-client" % "1.1-dt-20220914Z-ef7250",
  "org.scalablytyped" %%% "node-red__registry" % "1.2-dt-20220912Z-f2ee31",
  "org.scalablytyped" %%% "node-red__runtime" % "1.2-dt-20211202Z-dcfb13",
  "org.scalablytyped" %%% "node-red__util" % "1.2-dt-20220624Z-f86e94",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20220912Z-92a982",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-4e85dc",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-170623",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-ee8a54",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-c0e5e0",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-1d3faa",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-c9400f",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20220818Z-66ae86")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
