organization := "org.scalablytyped"
name := "mongodb-memory-server"
version := "6.2.4-7bfd60"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20191119Z-8d2320",
  "org.scalablytyped" %%% "https-proxy-agent" % "2.2.2-4b6030",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20200210Z-24f5c6",
  "org.scalablytyped" %%% "mongodb-memory-server-core" % "6.2.4-752436",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-d6af7e",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "tmp" % "0.1-dt-20190327Z-ba5b0a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
