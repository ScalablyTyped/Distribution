organization := "org.scalablytyped"
name := "node-red__editor-client"
version := "1.1-dt-20220914Z-c35988"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ace" % "0.0-unknown-dt-20221103Z-1609a2",
  "org.scalablytyped" %%% "cors" % "2.8-dt-20221103Z-31839f",
  "org.scalablytyped" %%% "express" % "4.17-dt-20220913Z-a7050d",
  "org.scalablytyped" %%% "express-serve-static-core" % "0.1.1-2c076a",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-b865bf",
  "org.scalablytyped" %%% "jsonata" % "1.8.6-ad0d4a",
  "org.scalablytyped" %%% "mime" % "3.0-dt-20220804Z-e2d669",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "node-red__registry" % "1.2-dt-20220912Z-1a016e",
  "org.scalablytyped" %%% "node-red__runtime" % "1.2-dt-20211202Z-2fcc5a",
  "org.scalablytyped" %%% "node-red__util" % "1.2-dt-20220624Z-33c2ec",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20220912Z-3d15b7",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20220913Z-c05674",
  "org.scalablytyped" %%% "serve-static" % "1.15-dt-20220729Z-9d2495",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-d89e1b",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
