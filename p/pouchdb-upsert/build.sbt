organization := "org.scalablytyped"
name := "pouchdb-upsert"
version := "2.2-dt-20190212Z-1f9e7c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-da708a",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-0a9c96",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-724741",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        