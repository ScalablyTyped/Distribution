organization := "org.scalablytyped"
name := "p-any"
version := "2.1.0-c97377"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aggregate-error" % "3.0.1-8b7f87",
  "org.scalablytyped" %%% "p-cancelable" % "2.0.0-4b1df6",
  "org.scalablytyped" %%% "p-some" % "4.1.0-bd8d6e",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "type-fest" % "0.3.1-ddff27")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        