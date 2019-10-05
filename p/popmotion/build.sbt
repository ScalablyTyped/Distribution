organization := "org.scalablytyped"
name := "popmotion"
version := "8.7.0-2aac4b"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-53733d",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-c509da",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.2-b0eff2",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "style-value-types" % "3.1.6-6871f5",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-dad412")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        