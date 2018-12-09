organization := "org.scalablytyped"
name := "pascal-case"
version := "2.0.1-00e83b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-51d8ce",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-591733",
  "org.scalablytyped" %%% "no-case" % "2.3.2-8c6c74",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-2600b8",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-fd6b45")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        