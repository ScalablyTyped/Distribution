organization := "org.scalablytyped"
name := "pouchdb-replication"
version := "6.4-dt-20190212Z-ab08e7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190213Z-fec855",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190212Z-0d969a",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190205Z-a8e8b2",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-5f701d",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-44cca7",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        