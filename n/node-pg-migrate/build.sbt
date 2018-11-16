organization := "com.scalablytyped"
name := "node-pg-migrate"
version := "3.13.0-3ee66c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181109Z-67570f",
  "com.scalablytyped" %%% "mkdirp" % "0.5-dt-20181102Z-d16a31",
  "com.scalablytyped" %%% "moment" % "2.22.2-e2e353",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-806eaf",
  "com.scalablytyped" %%% "pg" % "7.4-dt-20181102Z-f421a9",
  "com.scalablytyped" %%% "pg-types" % "1.11-dt-20181102Z-f007ca",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "yargs" % "12.0-dt-20181102Z-3cd75b",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        