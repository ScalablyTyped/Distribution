organization := "org.scalablytyped"
name := "mdast-util-gfm-autolink-literal"
version := "1.0.2-bc3fa1"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-ec20cb",
  "org.scalablytyped" %%% "mdast-util-find-and-replace" % "2.2.1-be2d8f",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-d60acc",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-b850f4",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-f5065a",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-f6f04e",
  "org.scalablytyped" %%% "unist-util-is" % "5.1.1-5573c8",
  "org.scalablytyped" %%% "unist-util-visit-parents" % "5.1.1-e686f3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
