organization := "org.scalablytyped"
name := "node-red-node-test-helper"
version := "0.2-dt-20220701Z-79d9c8"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ace" % "0.0-unknown-dt-20220818Z-a67f87",
  "org.scalablytyped" %%% "cookiejar" % "2.1-dt-20211202Z-232cef",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20211202Z-e65c64",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-6f01fe",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-c34bb1",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-d9fe7d",
  "org.scalablytyped" %%% "jsonata" % "1.8.6-cf8034",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-21c0d6",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "node-red" % "1.2-dt-20220329Z-7ffa9a",
  "org.scalablytyped" %%% "node-red__editor-api" % "1.1-dt-20211202Z-10607b",
  "org.scalablytyped" %%% "node-red__editor-client" % "1.1-dt-20220914Z-8da731",
  "org.scalablytyped" %%% "node-red__registry" % "1.2-dt-20220912Z-92afc4",
  "org.scalablytyped" %%% "node-red__runtime" % "1.2-dt-20211202Z-c643cf",
  "org.scalablytyped" %%% "node-red__util" % "1.2-dt-20220624Z-5b7ba3",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20220912Z-75e352",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-11838a",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-77d826",
  "org.scalablytyped" %%% "sinon" % "10.0-dt-20220720Z-a59c87",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "8.1-dt-20220323Z-d2df15",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-964e56",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "superagent" % "4.1-dt-20220125Z-4c8313",
  "org.scalablytyped" %%% "supertest" % "v2.0.1-dt-20220818Z-4f8bbc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
