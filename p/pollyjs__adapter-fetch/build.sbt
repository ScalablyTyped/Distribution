organization := "org.scalablytyped"
name := "pollyjs__adapter-fetch"
version := "2.0-dt-20190131Z-8821a6"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "3.0-dt-20191226Z-b84112",
  "org.scalablytyped" %%% "pollyjs__core" % "3.0-dt-20191226Z-2e4c7c",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20190731Z-6c83df",
  "org.scalablytyped" %%% "std" % "3.7-953338")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        