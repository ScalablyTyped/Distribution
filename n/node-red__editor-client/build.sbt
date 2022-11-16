organization := "org.scalablytyped"
name := "node-red__editor-client"
version := "1.1-dt-20220914Z-22bfd8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ace" % "0.0-unknown-dt-20221103Z-76623a",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20221103Z-6201fd",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-2966c9",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-5cc384",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-20efda",
  "org.scalablytyped" %%% "jsonata" % "1.8.6-f18a35",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-4d0efa",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "node-red__registry" % "1.2-dt-20220912Z-8601b7",
  "org.scalablytyped" %%% "node-red__runtime" % "1.2-dt-20211202Z-af9e1c",
  "org.scalablytyped" %%% "node-red__util" % "1.2-dt-20220624Z-aaa28c",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20220912Z-22f25e",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-fa36ba",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-088887",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-224716",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
