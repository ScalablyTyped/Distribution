organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "3.14.2-e724e7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-e3741e",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-a2e6b0",
  "org.scalablytyped" %%% "moment" % "2.22.2-d1dfb5",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181009Z-e6c0eb",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180910Z-fd3926",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20180929Z-35bbf5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        