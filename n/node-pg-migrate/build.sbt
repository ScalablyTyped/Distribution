organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "3.14.2-646214"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-010a28",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-00cb09",
  "org.scalablytyped" %%% "moment" % "2.23.0-e5bac4",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181008Z-12708b",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-c1a462",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20181231Z-a71d52")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        