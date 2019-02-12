organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "3.16.0-ebcf4c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-cf3a73",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-98fe12",
  "org.scalablytyped" %%% "moment" % "2.24.0-22f1d2",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181008Z-5b0fd0",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-1a9905",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190124Z-31d9dc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        