organization := "org.scalablytyped"
name := "playable"
version := "2.11.1-2dfa22"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20201028Z-2371d9",
  "org.scalablytyped" %%% "chromecast-caf-sender" % "1.0-dt-20200121Z-ac42ef",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-ed268e",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20201002Z-d32a51",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20201002Z-a2fb33",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20201030Z-99d44a",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
