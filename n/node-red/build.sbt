organization := "org.scalablytyped"
name := "node-red"
version := "1.2-dt-20220329Z-10e9fe"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ace" % "0.0-unknown-dt-20221103Z-5ddfc5",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20221103Z-d598d6",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-cb1e35",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5f1c10",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-9a2a4d",
  "org.scalablytyped" %%% "jsonata" % "1.8.6-d9480c",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-85c9dc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "node-red__editor-api" % "1.1-dt-20211202Z-5b0b1e",
  "org.scalablytyped" %%% "node-red__editor-client" % "1.1-dt-20220914Z-fca87a",
  "org.scalablytyped" %%% "node-red__registry" % "1.2-dt-20220912Z-4bdf71",
  "org.scalablytyped" %%% "node-red__runtime" % "1.2-dt-20211202Z-281b91",
  "org.scalablytyped" %%% "node-red__util" % "1.2-dt-20220624Z-6a34ad",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20220912Z-432397",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-137229",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-d3379f",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-4e4849",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
