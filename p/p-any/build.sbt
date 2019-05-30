organization := "org.scalablytyped"
name := "p-any"
version := "2.1.0-6d123e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "aggregate-error" % "3.0.0-8aafd2",
  "org.scalablytyped" %%% "p-cancelable" % "2.0.0-674096",
  "org.scalablytyped" %%% "p-some" % "4.1.0-d17aeb",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "type-fest" % "0.3.1-1a26b8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        