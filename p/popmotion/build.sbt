organization := "org.scalablytyped"
name := "popmotion"
version := "8.7.1-d255da"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-14c50d",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-613c41",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-c71777",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "style-value-types" % "3.1.7-4f6aa1",
  "org.scalablytyped" %%% "stylefire" % "7.0.1-1b620b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        