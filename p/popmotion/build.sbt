organization := "org.scalablytyped"
name := "popmotion"
version := "8.7.0-b9e769"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-bd50e7",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-3f22d4",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.1-94a61b",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "style-value-types" % "3.1.5-4369f4",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-dfcc9e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        