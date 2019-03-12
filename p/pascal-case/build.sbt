organization := "org.scalablytyped"
name := "pascal-case"
version := "2.0.1-c981aa"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-0e82d1",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-d9d6b6",
  "org.scalablytyped" %%% "no-case" % "2.3.2-4ee13c",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-2b2ae9",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-30186c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        