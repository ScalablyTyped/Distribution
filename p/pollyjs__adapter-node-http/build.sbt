organization := "org.scalablytyped"
name := "pollyjs__adapter-node-http"
version := "2.0-dt-20190131Z-99b756"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "3.0-dt-20191226Z-fbb83a",
  "org.scalablytyped" %%% "pollyjs__core" % "4.0-dt-20200125Z-a28f0f",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20190731Z-4f9d4c",
  "org.scalablytyped" %%% "std" % "3.7-1b8369")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
