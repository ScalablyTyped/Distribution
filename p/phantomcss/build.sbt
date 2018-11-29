organization := "com.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20180910Z-8c5827"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "casperjs" % "1.1-dt-20180910Z-745811",
  "com.scalablytyped" %%% "phantomjs" % "1.9-dt-20180910Z-81379c",
  "com.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20180910Z-1fe54b",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        