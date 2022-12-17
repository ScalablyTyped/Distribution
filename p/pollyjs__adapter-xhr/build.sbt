organization := "org.scalablytyped"
name := "pollyjs__adapter-xhr"
version := "6.0.5-c8b562"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-c810c5",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "pollyjs__adapter" % "6.0.4-883a0e",
  "org.scalablytyped" %%% "pollyjs__core" % "6.0.5-27b8a8",
  "org.scalablytyped" %%% "pollyjs__persister" % "6.0.5-916c0f",
  "org.scalablytyped" %%% "set-cookie-parser" % "2.4-dt-20211223Z-f27e09",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
