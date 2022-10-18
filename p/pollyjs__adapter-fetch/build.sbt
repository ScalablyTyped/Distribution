organization := "org.scalablytyped"
name := "pollyjs__adapter-fetch"
version := "2.0-dt-20211202Z-837949"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "pollyjs__adapter" % "4.3-dt-20211202Z-7b3fbc",
  "org.scalablytyped" %%% "pollyjs__core" % "4.3-dt-20211202Z-fcdbf0",
  "org.scalablytyped" %%% "pollyjs__persister" % "4.3-dt-20211202Z-bcebd0",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
