organization := "org.scalablytyped"
name := "phosphor__commands"
version := "1.7.1-9cbced"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-db25ba",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-2e6e2f",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.0-38a9ea",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.0-429f20",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        