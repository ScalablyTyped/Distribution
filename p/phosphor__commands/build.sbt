organization := "org.scalablytyped"
name := "phosphor__commands"
version := "1.7.0-33b011"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-d56d5f",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-cbfd04",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.0-3cd291",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.0-315994",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        