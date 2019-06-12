organization := "org.scalablytyped"
name := "popmotion"
version := "8.6.10-a38d5e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "framesync" % "4.0.2-26816d",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-905b80",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.0-5f1bcf",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "style-value-types" % "3.1.4-1864e6",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-26abd1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        