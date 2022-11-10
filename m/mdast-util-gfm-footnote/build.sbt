organization := "org.scalablytyped"
name := "mdast-util-gfm-footnote"
version := "1.0.1-07e085"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-aaf55e",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-9867da",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-6d29ff",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-572d0c",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-cacd8c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
