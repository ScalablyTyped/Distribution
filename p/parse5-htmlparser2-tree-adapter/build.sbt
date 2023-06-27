organization := "org.scalablytyped"
name := "parse5-htmlparser2-tree-adapter"
version := "7.0.0-e1207d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "domelementtype" % "2.3.0-6dc867",
  "org.scalablytyped" %%% "domhandler" % "5.0.3-cb323d",
  "org.scalablytyped" %%% "parse5" % "7.1.2-ff5512",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
