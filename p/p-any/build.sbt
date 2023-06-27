organization := "org.scalablytyped"
name := "p-any"
version := "4.0.0-9ebd8e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "aggregate-error" % "4.0.1-ea470e",
  "org.scalablytyped" %%% "p-cancelable" % "4.0.1-74dbf6",
  "org.scalablytyped" %%% "p-some" % "6.0.0-8d8968",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
