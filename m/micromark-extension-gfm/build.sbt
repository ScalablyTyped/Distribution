organization := "org.scalablytyped"
name := "micromark-extension-gfm"
version := "2.0.1-f9f47c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "micromark-extension-gfm-footnote" % "1.0.4-1a4c4c",
  "org.scalablytyped" %%% "micromark-extension-gfm-strikethrough" % "1.0.4-71c9b5",
  "org.scalablytyped" %%% "micromark-util-types" % "1.1.0-22a85a",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
