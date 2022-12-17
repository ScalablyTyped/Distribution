organization := "org.scalablytyped"
name := "micromark-extension-gfm"
version := "2.0.1-b68fdc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "micromark-extension-gfm-footnote" % "1.0.4-59c557",
  "org.scalablytyped" %%% "micromark-extension-gfm-strikethrough" % "1.0.4-9e187e",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-8f97fd",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
