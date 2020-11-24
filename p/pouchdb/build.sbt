organization := "org.scalablytyped"
name := "pouchdb"
version := "6.4-dt-20200304Z-a4921d"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-423206",
  "org.scalablytyped" %%% "pouchdb-adapter-fruitdown" % "6.1-dt-20200515Z-618d1b",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20200519Z-a4e0fa",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20200728Z-3eb1f7",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
