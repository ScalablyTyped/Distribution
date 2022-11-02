organization := "org.scalablytyped"
name := "pollyjs__adapter-fetch"
version := "6.0.5-b49f2f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.0-8a2d46",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "pollyjs__adapter" % "6.0.4-314f03",
  "org.scalablytyped" %%% "pollyjs__core" % "6.0.5-316c91",
  "org.scalablytyped" %%% "pollyjs__persister" % "6.0.5-d7fa1f",
  "org.scalablytyped" %%% "set-cookie-parser" % "2.4-dt-20211223Z-1295a3",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
