organization := "org.scalablytyped"
name := "popmotion"
version := "8.7.1-596890"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-c1ac6c",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-dca701",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.4-ed4505",
  "org.scalablytyped" %%% "std" % "3.7-96076c",
  "org.scalablytyped" %%% "style-value-types" % "3.1.7-4d388f",
  "org.scalablytyped" %%% "stylefire" % "7.0.1-f6a45f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        