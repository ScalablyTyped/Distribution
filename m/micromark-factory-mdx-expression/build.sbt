organization := "org.scalablytyped"
name := "micromark-factory-mdx-expression"
version := "1.0.6-5f730e"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "acorn" % "8.8.2-05cc67",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20230419Z-f51b02",
  "org.scalablytyped" %%% "estree-util-visit" % "1.2.0-09d316",
  "org.scalablytyped" %%% "micromark-util-events-to-acorn" % "1.2.0-93014b",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-813843",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20221230Z-5d1d9b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
