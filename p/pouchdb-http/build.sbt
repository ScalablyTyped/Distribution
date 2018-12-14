organization := "org.scalablytyped"
name := "pouchdb-http"
version := "6.1-dt-20180910Z-f711e7"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "0.0-unknown-dt-20181004Z-c10888",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-055952",
  "org.scalablytyped" %%% "pouchdb-adapter-http" % "6.1-dt-20180910Z-c99824",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20181121Z-26f6ba",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20180910Z-fcd084",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        