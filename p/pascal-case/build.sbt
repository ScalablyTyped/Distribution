organization := "org.scalablytyped"
name := "pascal-case"
version := "2.0.1-a90d28"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-f1c91f",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-1519b7",
  "org.scalablytyped" %%% "no-case" % "2.3.2-f67efd",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-381a7a",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-edba2a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        