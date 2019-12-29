organization := "org.scalablytyped"
name := "mongodb-memory-server"
version := "6.2.0-1f2e07"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20191119Z-8b0bf3",
  "org.scalablytyped" %%% "https-proxy-agent" % "2.2.2-0a4e8a",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191223Z-d842b7",
  "org.scalablytyped" %%% "mongodb-memory-server-core" % "6.2.0-b8855b",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        