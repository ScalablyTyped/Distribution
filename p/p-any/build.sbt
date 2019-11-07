organization := "org.scalablytyped"
name := "p-any"
version := "2.1.0-0b2f65"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aggregate-error" % "3.0.1-feba11",
  "org.scalablytyped" %%% "p-cancelable" % "2.0.0-146290",
  "org.scalablytyped" %%% "p-some" % "4.1.0-d3fad5",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "type-fest" % "0.3.1-a5afd0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        