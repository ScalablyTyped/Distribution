organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "3.14.2-cc75a8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-5a27ec",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-ae5704",
  "org.scalablytyped" %%% "moment" % "2.23.0-fd2546",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181008Z-1f5d39",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-8c92eb",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20181231Z-419f3a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        