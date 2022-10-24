organization := "org.scalablytyped"
name := "micromark-extension-mdx-jsx"
version := "1.0.3-9e3308"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "acorn" % "8.8.0-8dbb4d",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "estree-util-visit" % "1.2.0-45d89b",
  "org.scalablytyped" %%% "micromark-factory-mdx-expression" % "1.0.6-efe428",
  "org.scalablytyped" %%% "micromark-util-events-to-acorn" % "1.2.0-749ac0",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-bd4ab8",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-ecc657")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
