organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "3.14.2-c0da99"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181203Z-0a02fb",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180214Z-6a0247",
  "org.scalablytyped" %%% "moment" % "2.23.0-9a5931",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181008Z-04cf74",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180214Z-197e66",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20181222Z-0294e0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        