organization := "org.scalablytyped"
name := "pollyjs__adapter-fetch"
version := "6.0.5-980b8b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-c810c5",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "pollyjs__adapter" % "6.0.4-d9328b",
  "org.scalablytyped" %%% "pollyjs__core" % "6.0.5-1fa769",
  "org.scalablytyped" %%% "pollyjs__persister" % "6.0.5-7285fd",
  "org.scalablytyped" %%% "set-cookie-parser" % "2.4-dt-20211223Z-010bf4",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
