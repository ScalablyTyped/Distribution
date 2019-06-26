organization := "org.scalablytyped"
name := "popmotion"
version := "8.7.0-40920c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "framesync" % "4.0.2-26816d",
  "org.scalablytyped" %%% "popmotion__easing" % "1.0.2-905b80",
  "org.scalablytyped" %%% "popmotion__popcorn" % "0.4.0-7060d0",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "style-value-types" % "3.1.4-808183",
  "org.scalablytyped" %%% "stylefire" % "4.1.4-cd5687")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        