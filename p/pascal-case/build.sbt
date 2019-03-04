organization := "org.scalablytyped"
name := "pascal-case"
version := "2.0.1-f47187"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-ef2f8a",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-e04dbe",
  "org.scalablytyped" %%% "no-case" % "2.3.2-0f7868",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-7522dc",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-cef882")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        