organization := "org.scalablytyped"
name := "pascal-case"
version := "2.0.1-b55f15"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-c44f92",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-c8aeef",
  "org.scalablytyped" %%% "no-case" % "2.3.2-5f1a48",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-b0d595",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-274a6d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        