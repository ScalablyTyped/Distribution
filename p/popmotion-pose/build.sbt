organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.8-eac76e"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-282561",
  "org.scalablytyped" %%% "popmotion" % "8.7.0-dbd845",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-ce16ed",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.1-0f6953",
  "org.scalablytyped" %%% "pose-core" % "2.1.0-791504",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "style-value-types" % "3.1.5-aa7118",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-a37944",
  "org.scalablytyped" %%% "ts-essentials" % "1.0.4-1e345c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        