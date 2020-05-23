organization := "org.scalablytyped"
name := "pollyjs__adapter-node-http"
version := "2.0-dt-20200515Z-c2dd55"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "3.0-dt-20200515Z-33e7f3",
  "org.scalablytyped" %%% "pollyjs__core" % "4.0-dt-20200125Z-1ffa93",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20200515Z-15f81f",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
