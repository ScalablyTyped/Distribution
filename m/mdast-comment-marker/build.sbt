organization := "org.scalablytyped"
name := "mdast-comment-marker"
version := "2.1.0-9b48d0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20211202Z-c68da6",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.2.0-bd49a6",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.0-6893f2",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.3.0-ef9fe5",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-8f97fd",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-bd4a10")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
