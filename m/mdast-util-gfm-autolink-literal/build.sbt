organization := "org.scalablytyped"
name := "mdast-util-gfm-autolink-literal"
version := "1.0.2-8c75f2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "mdast" % "3.0-dt-20230320Z-8fafb0",
  "org.scalablytyped" %%% "mdast-util-find-and-replace" % "2.2.1-fb2f35",
  "org.scalablytyped" %%% "mdast-util-from-markdown" % "1.3.0-50ce5f",
  "org.scalablytyped" %%% "mdast-util-to-markdown" % "1.5.0-1f7998",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-813843",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20221230Z-5d1d9b",
  "org.scalablytyped" %%% "unist-util-is" % "5.2.1-049c4b",
  "org.scalablytyped" %%% "unist-util-visit-parents" % "5.1.3-b20940")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
