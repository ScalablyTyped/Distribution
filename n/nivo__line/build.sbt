organization := "org.scalablytyped"
name := "nivo__line"
version := "0.61.1-605add"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.9-7dae47",
  "org.scalablytyped" %%% "nivo__axes" % "0.61.0-68c1b3",
  "org.scalablytyped" %%% "nivo__colors" % "0.61.0-2a81d8",
  "org.scalablytyped" %%% "nivo__core" % "0.61.0-cab2bf",
  "org.scalablytyped" %%% "nivo__legends" % "0.61.1-358a67",
  "org.scalablytyped" %%% "nivo__scales" % "0.61.0-9b28b3",
  "org.scalablytyped" %%% "nivo__tooltip" % "0.61.0-a25c49",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-034048",
  "org.scalablytyped" %%% "react" % "16.9-dt-20200624Z-23874e",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
