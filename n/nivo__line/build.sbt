organization := "org.scalablytyped"
name := "nivo__line"
version := "0.62.0-94a1a9"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "3.0.2-b6fa26",
  "org.scalablytyped" %%% "nivo__axes" % "0.62.0-b82841",
  "org.scalablytyped" %%% "nivo__colors" % "0.62.0-8dc7f5",
  "org.scalablytyped" %%% "nivo__core" % "0.62.0-acc635",
  "org.scalablytyped" %%% "nivo__legends" % "0.62.0-f60eea",
  "org.scalablytyped" %%% "nivo__scales" % "0.62.0-55f48d",
  "org.scalablytyped" %%% "nivo__tooltip" % "0.62.0-83791c",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-64dc32",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200711Z-7368c8",
  "org.scalablytyped" %%% "std" % "3.9-bafc13")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
