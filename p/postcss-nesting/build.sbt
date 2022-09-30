organization := "org.scalablytyped"
name := "postcss-nesting"
version := "10.2.0-f58cbc"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "postcss" % "8.4.16-57c149",
  "org.scalablytyped" %%% "postcss-selector-parser" % "6.0.10-48f2cd",
  "org.scalablytyped" %%% "source-map-js" % "1.0.2-70367f",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
