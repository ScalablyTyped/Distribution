organization := "org.scalablytyped"
name := "pollyjs__adapter-node-http"
version := "2.0-dt-20200925Z-bf7818"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "pollyjs__adapter" % "4.3-dt-20200925Z-a2abdb",
  "org.scalablytyped" %%% "pollyjs__core" % "4.3-dt-20200925Z-e98bec",
  "org.scalablytyped" %%% "pollyjs__persister" % "4.3-dt-20200925Z-689490",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
