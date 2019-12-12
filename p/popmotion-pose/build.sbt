organization := "org.scalablytyped"
name := "popmotion-pose"
version := "3.4.11-4c631d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-7950c8",
  "org.scalablytyped" %%% "popmotion" % "8.7.1-86645d",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-613c41",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-036b73",
  "org.scalablytyped" %%% "pose-core" % "2.1.1-d9f4cc",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "style-value-types" % "3.1.7-92fe7a",
  "org.scalablytyped" %%% "stylefire" % "7.0.1-84193e",
  "org.scalablytyped" %%% "ts-essentials" % "1.0.4-69d096")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        