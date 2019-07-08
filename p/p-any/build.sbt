organization := "org.scalablytyped"
name := "p-any"
version := "2.1.0-22a46f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aggregate-error" % "3.0.0-ae4f0f",
  "org.scalablytyped" %%% "p-cancelable" % "2.0.0-b9d0bb",
  "org.scalablytyped" %%% "p-some" % "4.1.0-4edd8f",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "type-fest" % "0.3.1-312d32")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        