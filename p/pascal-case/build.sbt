organization := "org.scalablytyped"
name := "pascal-case"
version := "2.0.1-a12a8c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-72337a",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-b63021",
  "org.scalablytyped" %%% "no-case" % "2.3.2-188952",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-a72ccd",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-cc80d0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        