organization := "com.scalablytyped"
name := "node-pg-migrate"
version := "3.14.0-0a04a4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "lodash" % "4.14-dt-20181105Z-aa3127",
  "com.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-697e07",
  "com.scalablytyped" %%% "moment" % "2.22.2-cce931",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181129Z-9f7a18",
  "com.scalablytyped" %%% "pg" % "7.4-dt-20181009Z-f71955",
  "com.scalablytyped" %%% "pg-types" % "1.11-dt-20180910Z-22496f",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "yargs" % "12.0-dt-20180929Z-9dda57",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        