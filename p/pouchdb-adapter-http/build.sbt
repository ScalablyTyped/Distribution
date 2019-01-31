organization := "org.scalablytyped"
name := "pouchdb-adapter-http"
version := "6.1-dt-20180214Z-b0a965"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-3f5e62",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-d4cb0b",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181213Z-948682",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180611Z-92e410",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        