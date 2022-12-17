organization := "org.scalablytyped"
name := "micromark-extension-mdx-jsx"
version := "1.0.3-d00e3f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "acorn" % "8.8.1-b17c2d",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-1eb2b4",
  "org.scalablytyped" %%% "estree-util-visit" % "1.2.0-7d1a7f",
  "org.scalablytyped" %%% "micromark-factory-mdx-expression" % "1.0.6-38bd3b",
  "org.scalablytyped" %%% "micromark-util-events-to-acorn" % "1.2.0-babdcc",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-8f97fd",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-bd4a10")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
