organization := "org.scalablytyped"
name := "pollyjs__adapter-xhr"
version := "2.6-dt-20200925Z-9d6b37"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "4.3-dt-20200925Z-73b04f",
  "org.scalablytyped" %%% "pollyjs__core" % "4.3-dt-20200925Z-875491",
  "org.scalablytyped" %%% "pollyjs__persister" % "4.3-dt-20200925Z-1da645",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
