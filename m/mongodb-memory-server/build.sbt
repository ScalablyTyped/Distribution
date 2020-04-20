organization := "org.scalablytyped"
name := "mongodb-memory-server"
version := "6.5.2-83587f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "agent-base" % "4.2-dt-20180801Z-385a6e",
  "org.scalablytyped" %%% "https-proxy-agent" % "5.0.0-4be908",
  "org.scalablytyped" %%% "mongodb-memory-server-core" % "6.5.2-b43c14",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "std" % "3.8-9b2470",
  "org.scalablytyped" %%% "tmp" % "0.1-dt-20200227Z-d7ad30")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
