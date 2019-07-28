organization := "org.scalablytyped"
name := "p-any"
version := "2.1.0-195983"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aggregate-error" % "3.0.0-29420f",
  "org.scalablytyped" %%% "p-cancelable" % "2.0.0-d5a320",
  "org.scalablytyped" %%% "p-some" % "4.1.0-3a2abb",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "type-fest" % "0.3.1-51ba03")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        