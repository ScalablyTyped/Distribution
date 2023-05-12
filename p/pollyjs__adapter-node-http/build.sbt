organization := "org.scalablytyped"
name := "pollyjs__adapter-node-http"
version := "6.0.5-a73054"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-7750ff",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "pollyjs__adapter" % "6.0.4-ea8184",
  "org.scalablytyped" %%% "pollyjs__core" % "6.0.5-db2f68",
  "org.scalablytyped" %%% "pollyjs__persister" % "6.0.5-4f933b",
  "org.scalablytyped" %%% "set-cookie-parser" % "2.4-dt-20211223Z-ede7b9",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
