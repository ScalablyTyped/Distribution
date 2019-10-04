organization := "org.scalablytyped"
name := "p-any"
version := "2.1.0-aee960"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aggregate-error" % "3.0.1-ebd75c",
  "org.scalablytyped" %%% "p-cancelable" % "2.0.0-05ff94",
  "org.scalablytyped" %%% "p-some" % "4.1.0-6f0653",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "type-fest" % "0.3.1-00e793")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        