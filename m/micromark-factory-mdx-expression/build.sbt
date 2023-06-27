organization := "org.scalablytyped"
name := "micromark-factory-mdx-expression"
version := "1.0.9-8728b4"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "acorn" % "8.9.0-6b5b67",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20230419Z-b546e9",
  "org.scalablytyped" %%% "micromark-util-events-to-acorn" % "1.2.3-064263",
  "org.scalablytyped" %%% "micromark-util-types" % "1.1.0-22a85a",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20221230Z-9eb15f",
  "org.scalablytyped" %%% "vfile-message" % "4.0.1-85ce0b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
