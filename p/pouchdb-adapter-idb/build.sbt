organization := "com.scalablytyped"
name := "pouchdb-adapter-idb"
version := "6.1-dt-20180910Z-36771c"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-8c87a5",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181116Z-cadd20",
  "com.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-1f4e97",
  "com.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181104Z-ad6ad2",
  "com.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180910Z-4f298c",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        