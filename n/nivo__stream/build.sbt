organization := "org.scalablytyped"
name := "nivo__stream"
version := "0.59.3-3e0094"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "nivo__axes" % "0.59.2-a85d8b",
  "org.scalablytyped" %%% "nivo__colors" % "0.59.0-b79ff2",
  "org.scalablytyped" %%% "nivo__core" % "0.59.1-d3305a",
  "org.scalablytyped" %%% "nivo__legends" % "0.59.1-d5c754",
  "org.scalablytyped" %%% "nivo__scales" % "0.59.3-b9212b",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191015Z-baf60f",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        