organization := "org.scalablytyped"
name := "pollyjs__adapter-xhr"
version := "2.6-dt-20200925Z-79a7c5"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "pollyjs__adapter" % "4.3-dt-20200925Z-8a46bb",
  "org.scalablytyped" %%% "pollyjs__core" % "4.3-dt-20200925Z-bb65f8",
  "org.scalablytyped" %%% "pollyjs__persister" % "4.3-dt-20200925Z-9ab58d",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
