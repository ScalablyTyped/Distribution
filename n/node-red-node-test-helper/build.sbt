organization := "org.scalablytyped"
name := "node-red-node-test-helper"
version := "0.2-dt-20220701Z-049ee4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ace" % "0.0-unknown-dt-20221103Z-07c976",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-4a1704",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20221103Z-32c34c",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-118d16",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-e830b8",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-33f6f2",
  "org.scalablytyped" %%% "jsonata" % "1.8.6-3647e7",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-381f52",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "node-red" % "1.2-dt-20220329Z-323d1f",
  "org.scalablytyped" %%% "node-red__editor-api" % "1.1-dt-20211202Z-5e7256",
  "org.scalablytyped" %%% "node-red__editor-client" % "1.1-dt-20220914Z-bd8a7b",
  "org.scalablytyped" %%% "node-red__registry" % "1.2-dt-20220912Z-802fd2",
  "org.scalablytyped" %%% "node-red__runtime" % "1.2-dt-20211202Z-d1f916",
  "org.scalablytyped" %%% "node-red__util" % "1.2-dt-20220624Z-34e59c",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20220912Z-8091e2",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-625bd0",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-5be9af",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-a1b7c7",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-ea1648",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-62291b",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-54cad4",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20220818Z-74b47f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
