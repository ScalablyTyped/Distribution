organization := "org.scalablytyped"
name := "pg-large-object"
version := "2.0-dt-20211202Z-21e71e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221023Z-05fcff",
  "org.scalablytyped" %%% "pg" % "8.6-dt-20220307Z-afafe6",
  "org.scalablytyped" %%% "pg-protocol" % "1.5.0-2921e9",
  "org.scalablytyped" %%% "pg-types" % "4.0.0-b7b5b5",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
