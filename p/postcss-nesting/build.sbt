organization := "org.scalablytyped"
name := "postcss-nesting"
version := "10.2.0-73f7c0"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "postcss" % "8.4.19-d08411",
  "org.scalablytyped" %%% "postcss-selector-parser" % "6.0.10-9690ec",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-cd43b3",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
