organization := "org.scalablytyped"
name := "postcss-custom-media"
version := "9.1.3-13d73b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "csstools__css-parser-algorithms" % "2.1.1-b9056e",
  "org.scalablytyped" %%% "csstools__css-tokenizer" % "2.1.1-996905",
  "org.scalablytyped" %%% "csstools__media-query-list-parser" % "2.0.4-1d834e",
  "org.scalablytyped" %%% "postcss" % "8.4.23-a62f41",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-781ad1",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
