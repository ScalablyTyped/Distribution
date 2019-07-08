organization := "org.scalablytyped"
name := "pollyjs__core"
version := "2.3-dt-20190227Z-b803e1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "2.0-dt-20190131Z-d31ce9",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20190131Z-6cc326",
  "org.scalablytyped" %%% "pollyjs__utils" % "2.0-dt-20190131Z-475a0b",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        