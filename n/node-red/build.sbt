organization := "org.scalablytyped"
name := "node-red"
version := "1.2-dt-20220329Z-6e255b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ace" % "0.0-unknown-dt-20220818Z-dc5dee",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20211202Z-2dd2b5",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-d74acb",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-06d29e",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20220624Z-8d8789",
  "org.scalablytyped" %%% "jsonata" % "1.8.6-d0596b",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-9884c6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221015Z-0a42ca",
  "org.scalablytyped" %%% "node-red__editor-api" % "1.1-dt-20211202Z-23deff",
  "org.scalablytyped" %%% "node-red__editor-client" % "1.1-dt-20220914Z-5c7748",
  "org.scalablytyped" %%% "node-red__registry" % "1.2-dt-20220912Z-109a7a",
  "org.scalablytyped" %%% "node-red__runtime" % "1.2-dt-20211202Z-77c610",
  "org.scalablytyped" %%% "node-red__util" % "1.2-dt-20220624Z-d6dfb6",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20220912Z-611eaa",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-76627f",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-696f82",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-a98916",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
