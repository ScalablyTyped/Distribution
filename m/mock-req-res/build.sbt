organization := "org.scalablytyped"
name := "mock-req-res"
version := "1.1-dt-20200925Z-393e12"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-c653a3",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-dccf4c",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-1cff6e",
  "org.scalablytyped" %%% "sinon" % "9.0-dt-20201003Z-292bea",
  "org.scalablytyped" %%% "sinonjs__fake-timers" % "6.0-dt-20200925Z-800e51",
  "org.scalablytyped" %%% "std" % "4.1-c651d0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
