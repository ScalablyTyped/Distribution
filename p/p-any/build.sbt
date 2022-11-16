organization := "org.scalablytyped"
name := "p-any"
version := "4.0.0-f37a97"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aggregate-error" % "4.0.1-eb63e8",
  "org.scalablytyped" %%% "p-cancelable" % "4.0.1-be4a63",
  "org.scalablytyped" %%% "p-some" % "6.0.0-c781c3",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
