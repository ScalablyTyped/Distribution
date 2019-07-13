organization := "org.scalablytyped"
name := "nivo__line"
version := "0.59.3-74de9c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c945ed",
  "org.scalablytyped" %%% "nivo__axes" % "0.59.2-4a555a",
  "org.scalablytyped" %%% "nivo__colors" % "0.59.0-f66f0a",
  "org.scalablytyped" %%% "nivo__core" % "0.59.1-f86bd4",
  "org.scalablytyped" %%% "nivo__legends" % "0.59.1-4ae99c",
  "org.scalablytyped" %%% "nivo__scales" % "0.59.3-137d55",
  "org.scalablytyped" %%% "nivo__tooltip" % "0.59.1-b1763f",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c6e514",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190703Z-55594c",
  "org.scalablytyped" %%% "std" % "3.5-983486")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        