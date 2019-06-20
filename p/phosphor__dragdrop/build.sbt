organization := "org.scalablytyped"
name := "phosphor__dragdrop"
version := "1.3.0-578ae4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "phosphor__algorithm" % "1.1.2-6b8368",
  "org.scalablytyped" %%% "phosphor__coreutils" % "1.3.0-e30cce",
  "org.scalablytyped" %%% "phosphor__disposable" % "1.1.2-f3e18f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        