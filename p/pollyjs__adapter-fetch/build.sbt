organization := "org.scalablytyped"
name := "pollyjs__adapter-fetch"
version := "2.0-dt-20200515Z-09e5d5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "4.3-dt-20200526Z-637ad0",
  "org.scalablytyped" %%% "pollyjs__core" % "4.3-dt-20200526Z-2e276e",
  "org.scalablytyped" %%% "pollyjs__persister" % "4.3-dt-20200526Z-29ef6d",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
