organization := "org.scalablytyped"
name := "node-red-node-test-helper"
version := "0.2-dt-20220701Z-923924"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ace" % "0.0-unknown-dt-20220818Z-dc5dee",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-6bed9b",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20211202Z-43e3d6",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-318396",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-9fa163",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-8d8789",
  "org.scalablytyped" %%% "jsonata" % "1.8.6-d0596b",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "node-red" % "1.2-dt-20220329Z-ddca73",
  "org.scalablytyped" %%% "node-red__editor-api" % "1.1-dt-20211202Z-a894d9",
  "org.scalablytyped" %%% "node-red__editor-client" % "1.1-dt-20220914Z-02294f",
  "org.scalablytyped" %%% "node-red__registry" % "1.2-dt-20220912Z-8d8e84",
  "org.scalablytyped" %%% "node-red__runtime" % "1.2-dt-20211202Z-a72352",
  "org.scalablytyped" %%% "node-red__util" % "1.2-dt-20220624Z-aa9151",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20220912Z-bd9df0",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-3bb8ca",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-86edef",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-e3da4a",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-a98916",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-aec72d",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20220818Z-584da6")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
