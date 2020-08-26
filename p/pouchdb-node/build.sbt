organization := "org.scalablytyped"
name := "pouchdb-node"
version := "6.1-dt-20200515Z-de9e39"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-1db63e",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20200519Z-6ca18c",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20200515Z-450df9",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
