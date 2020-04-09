organization := "org.scalablytyped"
name := "mongodb-memory-server"
version := "6.5.2-a68824"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "agent-base" % "4.2-dt-20180801Z-b9d420",
  "org.scalablytyped" %%% "https-proxy-agent" % "5.0.0-72c1b9",
  "org.scalablytyped" %%% "mongodb-memory-server-core" % "6.5.2-9e5c6b",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tmp" % "0.1-dt-20200227Z-ba5b0a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
