organization := "org.scalablytyped"
name := "pouchdb-mapreduce"
version := "6.1-dt-20190212Z-c6d668"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-b43721",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-147486",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-8c6050",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        