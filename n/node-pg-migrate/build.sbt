organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "3.15.0-36da9e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190116Z-c48db4",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-28c4a1",
  "org.scalablytyped" %%% "moment" % "2.24.0-68abed",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181008Z-8b8f40",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-bb8050",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190124Z-7f6a8f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        