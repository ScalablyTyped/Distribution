organization := "org.scalablytyped"
name := "node-red-node-test-helper"
version := "0.2-dt-20220701Z-08f739"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ace" % "0.0-unknown-dt-20220818Z-b6e31c",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-da621a",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20211202Z-dc5179",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-7a82fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-87e3cc",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-9d6f35",
  "org.scalablytyped" %%% "jsonata" % "1.8.6-575176",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-3b1911",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "node-red" % "1.2-dt-20220329Z-fc635b",
  "org.scalablytyped" %%% "node-red__editor-api" % "1.1-dt-20211202Z-532080",
  "org.scalablytyped" %%% "node-red__editor-client" % "1.1-dt-20220914Z-b2683a",
  "org.scalablytyped" %%% "node-red__registry" % "1.2-dt-20220912Z-6ccb69",
  "org.scalablytyped" %%% "node-red__runtime" % "1.2-dt-20211202Z-8c6be5",
  "org.scalablytyped" %%% "node-red__util" % "1.2-dt-20220624Z-034b5b",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20220912Z-753609",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-33ed42",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5e7139",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-556da5",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-7adbb2",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-cfd9ff",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-103db0",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20220818Z-dbd764")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
