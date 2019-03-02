organization := "org.scalablytyped"
name := "pouchdb-adapter-node-websql"
version := "6.1-dt-20190212Z-524f87"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-779d70",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-da59e9",
  "org.scalablytyped" %%% "pouchdb-adapter-websql" % "6.1-dt-20190212Z-bc610c",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-5b96fd",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-bd8d6c",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        