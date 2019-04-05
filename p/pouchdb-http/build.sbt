organization := "org.scalablytyped"
name := "pouchdb-http"
version := "6.1-dt-20190212Z-5a8199"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190328Z-74c562",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "node-fetch" % "2.3-dt-20190403Z-8a4c08",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20190212Z-c5298b",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-14cc06",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-07472c",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        