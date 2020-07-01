organization := "org.scalablytyped"
name := "pollyjs__adapter-fetch"
version := "2.0-dt-20200515Z-1d132f"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "4.3-dt-20200526Z-66c340",
  "org.scalablytyped" %%% "pollyjs__core" % "4.3-dt-20200526Z-dfa5a6",
  "org.scalablytyped" %%% "pollyjs__persister" % "4.3-dt-20200526Z-aa3bd0",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
