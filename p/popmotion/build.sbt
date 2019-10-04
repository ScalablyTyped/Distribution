organization := "org.scalablytyped"
name := "popmotion"
version := "8.7.0-4ed804"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-282561",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-ce16ed",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.2-5c25f9",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "style-value-types" % "3.1.6-270307",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-4be5b3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        