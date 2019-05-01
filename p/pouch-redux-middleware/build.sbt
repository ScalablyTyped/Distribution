organization := "org.scalablytyped"
name := "pouch-redux-middleware"
version := "0.5-dt-20180214Z-188f0a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-bc840e",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190212Z-977a7e",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-9be02e",
  "org.scalablytyped" %%% "redux" % "4.0.1-1382e4",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        