organization := "org.scalablytyped"
name := "pascal-case"
version := "2.0.1-4547f2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-4f2295",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-409600",
  "org.scalablytyped" %%% "no-case" % "2.3.2-427e23",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-8e28f8",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-7878fd")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        