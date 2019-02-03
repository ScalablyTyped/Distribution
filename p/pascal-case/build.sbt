organization := "org.scalablytyped"
name := "pascal-case"
version := "2.0.1-779d14"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-1956b5",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-f8ef62",
  "org.scalablytyped" %%% "no-case" % "2.3.2-5e99e2",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-b40f84",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-c15fe5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        