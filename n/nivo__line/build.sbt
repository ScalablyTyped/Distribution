organization := "org.scalablytyped"
name := "nivo__line"
version := "0.58.0-a19887"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-8a2cd0",
  "org.scalablytyped" %%% "nivo__axes" % "0.58.0-401390",
  "org.scalablytyped" %%% "nivo__colors" % "0.58.0-e782c5",
  "org.scalablytyped" %%% "nivo__core" % "0.58.0-053b53",
  "org.scalablytyped" %%% "nivo__legends" % "0.58.0-44c32a",
  "org.scalablytyped" %%% "nivo__scales" % "0.58.0-ae9f85",
  "org.scalablytyped" %%% "nivo__tooltip" % "0.58.0-b69d70",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c843c9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1fde1d",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        