organization := "org.scalablytyped"
name := "playable"
version := "2.11.1-f82fa5"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20201028Z-72256e",
  "org.scalablytyped" %%% "chromecast-caf-sender" % "1.0-dt-20200121Z-cd1851",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-05deaf",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20201002Z-4b69db",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20201002Z-f9857e",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20201030Z-0e2f59",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
