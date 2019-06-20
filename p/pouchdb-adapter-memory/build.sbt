organization := "org.scalablytyped"
name := "pouchdb-adapter-memory"
version := "6.1-dt-20190212Z-06aaff"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190411Z-9902a3",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20190619Z-a2d599",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20190212Z-d26fc1",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        