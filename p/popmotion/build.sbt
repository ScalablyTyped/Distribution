organization := "org.scalablytyped"
name := "popmotion"
version := "8.7.0-dc8bdc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "framesync" % "4.0.4-11603e",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-fc7ab9",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.1-2eb7f0",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "style-value-types" % "3.1.5-a18fad",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-cb5746")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        