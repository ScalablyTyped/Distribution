organization := "org.scalablytyped"
name := "micromark-factory-mdx-expression"
version := "1.0.6-5902a6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "acorn" % "8.8.1-3fee69",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1ed7c2",
  "org.scalablytyped" %%% "estree-util-visit" % "1.2.0-8aadbc",
  "org.scalablytyped" %%% "micromark-util-events-to-acorn" % "1.2.0-f16c69",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-572d0c",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-cacd8c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
