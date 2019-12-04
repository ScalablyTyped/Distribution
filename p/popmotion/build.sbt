organization := "org.scalablytyped"
name := "popmotion"
version := "8.7.1-6ea7ca"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-8951fe",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-613c41",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-036b73",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "style-value-types" % "3.1.7-92fe7a",
  "org.scalablytyped" %%% "stylefire" % "7.0.1-84193e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        