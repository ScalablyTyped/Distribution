organization := "org.scalablytyped"
name := "micromark-extension-mdx-jsx"
version := "1.0.3-b1d93d"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "acorn" % "8.8.1-9a457c",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6dfb17",
  "org.scalablytyped" %%% "estree-util-visit" % "1.2.0-2f3383",
  "org.scalablytyped" %%% "micromark-factory-mdx-expression" % "1.0.6-0ff509",
  "org.scalablytyped" %%% "micromark-util-events-to-acorn" % "1.2.0-17d4d9",
  "org.scalablytyped" %%% "micromark-util-types" % "1.0.2-653228",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "unist" % "2.0-dt-20220624Z-70245a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
