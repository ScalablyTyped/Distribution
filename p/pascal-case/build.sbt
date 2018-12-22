organization := "org.scalablytyped"
name := "pascal-case"
version := "2.0.1-4cbe51"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-794df0",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-e49760",
  "org.scalablytyped" %%% "no-case" % "2.3.2-a9e058",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-cb4b52",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-f4729d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        