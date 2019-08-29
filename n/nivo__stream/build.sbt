organization := "org.scalablytyped"
name := "nivo__stream"
version := "0.59.3-5254ab"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "nivo__axes" % "0.59.2-ff735d",
  "org.scalablytyped" %%% "nivo__colors" % "0.59.0-f866ab",
  "org.scalablytyped" %%% "nivo__core" % "0.59.1-cb7d8b",
  "org.scalablytyped" %%% "nivo__legends" % "0.59.1-d2039c",
  "org.scalablytyped" %%% "nivo__scales" % "0.59.3-d7cbd4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-fd4af0",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-6dcbc8",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        