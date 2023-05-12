organization := "org.scalablytyped"
name := "mdast-util-mdx"
version := "2.0.0-1e1baa"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "hast" % "2.3-dt-20211202Z-015615",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20230320Z-8fafb0",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.3.0-50ce5f",
  "org.scalablytyped" %%% "mdast-util-mdx-expression" % "1.3.2-1c8e08",
  "org.scalablytyped" %%% "mdast-util-mdx-jsx" % "2.1.0-01d39f",
  "org.scalablytyped" %%% "mdast-util-mdxjs-esm" % "1.3.0-6f7341",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.5.0-1f7998",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-813843",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20221230Z-5d1d9b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
