organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "3.15.0-4723d3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-e5b16b",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-bb0665",
  "org.scalablytyped" %%% "moment" % "2.24.0-cd7f45",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181008Z-dfaeb6",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-8967fb",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190124Z-edd14a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        