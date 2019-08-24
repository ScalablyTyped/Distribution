organization := "org.scalablytyped"
name := "nivo__stream"
version := "0.59.3-4de98e"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-c240ab",
  "org.scalablytyped" %%% "nivo__axes" % "0.59.2-a1f02b",
  "org.scalablytyped" %%% "nivo__colors" % "0.59.0-38503b",
  "org.scalablytyped" %%% "nivo__core" % "0.59.1-5a8562",
  "org.scalablytyped" %%% "nivo__legends" % "0.59.1-22ab9f",
  "org.scalablytyped" %%% "nivo__scales" % "0.59.3-e675c0",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-847c1a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        