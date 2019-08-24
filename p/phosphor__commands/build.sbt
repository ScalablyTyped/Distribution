organization := "org.scalablytyped"
name := "phosphor__commands"
version := "1.7.0-dc9378"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-969f70",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-61f8c4",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.0-b336a7",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.0-310d79",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        