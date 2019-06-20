organization := "org.scalablytyped"
name := "p-any"
version := "2.1.0-d07cec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "aggregate-error" % "3.0.0-072c0c",
  "org.scalablytyped" %%% "p-cancelable" % "2.0.0-d3f073",
  "org.scalablytyped" %%% "p-some" % "4.1.0-45f65e",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "type-fest" % "0.3.1-0eb3f0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        