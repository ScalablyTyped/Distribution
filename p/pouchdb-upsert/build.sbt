organization := "org.scalablytyped"
name := "pouchdb-upsert"
version := "2.2-dt-20200225Z-e1acfe"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-552094",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20200225Z-92e0ac",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20200225Z-fd0d95",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
