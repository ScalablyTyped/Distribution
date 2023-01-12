organization := "org.scalablytyped"
name := "pollyjs__adapter-fetch"
version := "6.0.5-b7e5f9"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-7750ff",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "pollyjs__adapter" % "6.0.4-d5c7a8",
  "org.scalablytyped" %%% "pollyjs__core" % "6.0.5-f87463",
  "org.scalablytyped" %%% "pollyjs__persister" % "6.0.5-cf99cd",
  "org.scalablytyped" %%% "set-cookie-parser" % "2.4-dt-20211223Z-202e8b",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
