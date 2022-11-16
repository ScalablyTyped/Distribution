organization := "org.scalablytyped"
name := "micromark-factory-mdx-expression"
version := "1.0.6-4789c1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "acorn" % "8.8.1-c271b3",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9e7169",
  "org.scalablytyped" %%% "estree-util-visit" % "1.2.0-4c5942",
  "org.scalablytyped" %%% "micromark-util-events-to-acorn" % "1.2.0-e8df4c",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-dfb004",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-b11504")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
