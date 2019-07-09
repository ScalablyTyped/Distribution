organization := "org.scalablytyped"
name := "phosphor__commands"
version := "1.6.3-2534d7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.3-165e39",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-801f09",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.2.0-0d2241",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.2.3-e890df",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        