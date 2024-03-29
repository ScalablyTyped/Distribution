organization := "org.scalablytyped"
name := "pollyjs__adapter-fetch"
version := "6.0.5-83293a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "loglevel" % "1.8.1-7750ff",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "pollyjs__adapter" % "6.0.4-e1728b",
  "org.scalablytyped" %%% "pollyjs__core" % "6.0.5-ed8cb9",
  "org.scalablytyped" %%% "pollyjs__persister" % "6.0.5-875068",
  "org.scalablytyped" %%% "set-cookie-parser" % "2.4-dt-20211223Z-7097aa",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
