organization := "org.scalablytyped"
name := "mdast-util-gfm-autolink-literal"
version := "1.0.2-44018c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-627ab0",
  "org.scalablytyped" %%% "mdast-util-find-and-replace" % "2.2.1-aae1ea",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-f0ca54",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-baeeb7",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-dfb004",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-b11504",
  "org.scalablytyped" %%% "unist-util-is" % "5.1.1-b7c697",
  "org.scalablytyped" %%% "unist-util-visit-parents" % "5.1.1-148bce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
