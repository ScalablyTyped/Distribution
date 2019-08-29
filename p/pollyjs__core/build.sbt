organization := "org.scalablytyped"
name := "pollyjs__core"
version := "2.6-dt-20190731Z-f05c58"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "2.0-dt-20190131Z-1df28a",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20190731Z-db8dad",
  "org.scalablytyped" %%% "pollyjs__utils" % "2.0-dt-20190131Z-8232d1",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        