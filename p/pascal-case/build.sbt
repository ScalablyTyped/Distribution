organization := "org.scalablytyped"
name := "pascal-case"
version := "2.0.1-deba29"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-751e42",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-082dba",
  "org.scalablytyped" %%% "no-case" % "2.3.2-a32b91",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-d5cf31",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-54e498")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        