organization := "com.scalablytyped"
name := "pascal-case"
version := "2.0.1-9f25c8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "camel-case" % "3.0.0-a987b4",
  "com.scalablytyped" %%% "lower-case" % "1.1.4-c49888",
  "com.scalablytyped" %%% "no-case" % "2.3.2-99e2c6",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "upper-case" % "1.1.3-49bf36",
  "com.scalablytyped" %%% "upper-case-first" % "1.1.2-8f8e40",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        