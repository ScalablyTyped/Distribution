organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "3.14.2-bd986e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-3dc8be",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-0a7381",
  "org.scalablytyped" %%% "moment" % "2.22.2-39aab6",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181009Z-985d2e",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180910Z-6f9337",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20180929Z-e4852f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        