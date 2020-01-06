organization := "org.scalablytyped"
name := "phosphor__dragdrop"
version := "1.4.1-7c26e5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.2.0-b2c4c6",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.1-dfa31a",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.3.1-b83200",
  "org.scalablytyped" %%% "phosphor__signaling" % "1.3.1-735c35",
  "org.scalablytyped" %%% "std" % "3.7-b6d959")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        