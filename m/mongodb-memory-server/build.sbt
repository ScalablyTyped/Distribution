organization := "org.scalablytyped"
name := "mongodb-memory-server"
version := "6.6.1-bfc6e0"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "agent-base" % "4.2-dt-20200515Z-9543da",
  "org.scalablytyped" %%% "https-proxy-agent" % "5.0.0-c70e4c",
  "org.scalablytyped" %%% "mongodb-memory-server-core" % "6.6.1-a8203f",
  "org.scalablytyped" %%% "node" % "14.0-dt-20200624Z-2fcd45",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "tmp" % "0.2-dt-20200501Z-fe67b8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
