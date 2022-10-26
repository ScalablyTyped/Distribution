organization := "org.scalablytyped"
name := "pollyjs__adapter"
version := "6.0.4-5bde6d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.0-8a2d46",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221024Z-2be228",
  "org.scalablytyped" %%% "pollyjs__core" % "6.0.5-d52f51",
  "org.scalablytyped" %%% "pollyjs__persister" % "6.0.5-f81b1a",
  "org.scalablytyped" %%% "set-cookie-parser" % "2.4-dt-20211223Z-b2c518",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
