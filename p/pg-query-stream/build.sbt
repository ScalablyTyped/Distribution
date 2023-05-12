organization := "org.scalablytyped"
name := "pg-query-stream"
version := "4.4.0-cd7367"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "pg" % "8.6-dt-20230328Z-26cecc",
  "org.scalablytyped" %%% "pg-protocol" % "1.6.0-b52dad",
  "org.scalablytyped" %%% "pg-types" % "4.0.1-1d8a95",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
