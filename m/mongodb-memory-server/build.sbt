organization := "org.scalablytyped"
name := "mongodb-memory-server"
version := "6.0.1-a43772"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20191119Z-c70afc",
  "org.scalablytyped" %%% "getos" % "3.0-dt-20180214Z-bf7a18",
  "org.scalablytyped" %%% "https-proxy-agent" % "2.2.2-b7932c",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191118Z-f1f7bb",
  "org.scalablytyped" %%% "mongodb-memory-server-core" % "6.0.1-112132",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191126Z-959704",
  "org.scalablytyped" %%% "std" % "3.7-1d724d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        