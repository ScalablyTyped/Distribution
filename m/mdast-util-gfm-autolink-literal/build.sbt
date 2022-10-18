organization := "org.scalablytyped"
name := "mdast-util-gfm-autolink-literal"
version := "1.0.2-b9c543"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-e12bb0",
  "org.scalablytyped" %%% "mdast-util-find-and-replace" % "2.2.1-2dc396",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-30618b",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-b4e699",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-5edda3",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-e61dba",
  "org.scalablytyped" %%% "unist-util-is" % "5.1.1-493358",
  "org.scalablytyped" %%% "unist-util-visit-parents" % "5.1.1-2684da")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
