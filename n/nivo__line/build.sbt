organization := "org.scalablytyped"
name := "nivo__line"
version := "0.59.3-9c27ac"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f01b27",
  "org.scalablytyped" %%% "nivo__axes" % "0.59.2-ea33ef",
  "org.scalablytyped" %%% "nivo__colors" % "0.59.0-258ded",
  "org.scalablytyped" %%% "nivo__core" % "0.59.1-e92449",
  "org.scalablytyped" %%% "nivo__legends" % "0.59.1-23d692",
  "org.scalablytyped" %%% "nivo__scales" % "0.59.3-0d26c0",
  "org.scalablytyped" %%% "nivo__tooltip" % "0.59.1-be9ae9",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-93079a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        