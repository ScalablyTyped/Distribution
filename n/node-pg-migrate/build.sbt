organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "3.14.2-d30e5e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-17fe49",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-b93923",
  "org.scalablytyped" %%% "moment" % "2.23.0-39ab00",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181009Z-c34a6f",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180910Z-04565c",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20180929Z-20416f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        