organization := "org.scalablytyped"
name := "meteor-mdg-validation-error"
version := "0.5-dt-20220624Z-6b0d2b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bson" % "4.7.0-e61bbb",
  "org.scalablytyped" %%% "buffer" % "6.0.3-34b6a7",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-4bfaa3",
  "org.scalablytyped" %%% "csstype" % "3.1.1-9b270c",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221103Z-33f6f2",
  "org.scalablytyped" %%% "meteor" % "2.8-dt-20221107Z-5bbb7d",
  "org.scalablytyped" %%% "mongodb" % "4.11.0-e6152b",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-9c1d48",
  "org.scalablytyped" %%% "react" % "18.0-dt-20221104Z-c1aa2f",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20211202Z-fd69ea",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-62291b",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20220722Z-19c570")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
