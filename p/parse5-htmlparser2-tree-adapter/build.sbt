organization := "org.scalablytyped"
name := "parse5-htmlparser2-tree-adapter"
version := "7.0.0-4b518e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-b522a9",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-79fef0",
  "org.scalablytyped" %%% "parse5" % "7.1.1-f42ad7",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
