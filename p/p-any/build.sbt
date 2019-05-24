organization := "org.scalablytyped"
name := "p-any"
version := "2.1.0-a217a5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "aggregate-error" % "3.0.0-e002f5",
  "org.scalablytyped" %%% "p-cancelable" % "2.0.0-7a382a",
  "org.scalablytyped" %%% "p-some" % "4.1.0-a5c00f",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "type-fest" % "0.3.1-c99266")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        