organization := "org.scalablytyped"
name := "pollyjs__adapter-fetch"
version := "2.0-dt-20200925Z-d42f85"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "pollyjs__adapter" % "4.3-dt-20200925Z-42323c",
  "org.scalablytyped" %%% "pollyjs__core" % "4.3-dt-20200925Z-85d1fd",
  "org.scalablytyped" %%% "pollyjs__persister" % "4.3-dt-20200925Z-413d8f",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
