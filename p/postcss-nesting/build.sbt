organization := "org.scalablytyped"
name := "postcss-nesting"
version := "11.3.0-879d81"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "postcss" % "8.4.24-d6da6b",
  "org.scalablytyped" %%% "postcss-selector-parser" % "6.0.13-f1b201",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-cdb3bd",
  "org.scalablytyped" %%% "std" % "5.1-9d5ad2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
