organization := "org.scalablytyped"
name := "p-any"
version := "2.1.0-131671"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "aggregate-error" % "3.0.0-a12cc4",
  "org.scalablytyped" %%% "p-cancelable" % "2.0.0-0c38a2",
  "org.scalablytyped" %%% "p-some" % "4.1.0-c8e27d",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "type-fest" % "0.3.1-f65952")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        