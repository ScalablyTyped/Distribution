organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "3.16.1-ae6046"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190212Z-f3a537",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-6559dc",
  "org.scalablytyped" %%% "moment" % "2.24.0-737009",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20190212Z-8f096a",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-b5a378",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20190212Z-dbed83")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        