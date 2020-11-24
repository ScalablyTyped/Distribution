organization := "org.scalablytyped"
name := "plottable"
version := "3.9.0-ce634b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-path" % "2.0-dt-20201002Z-2014df",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-789400",
  "org.scalablytyped" %%% "d3-shape" % "2.0-dt-20201028Z-922d2f",
  "org.scalablytyped" %%% "d3-time" % "2.0-dt-20201002Z-415e8e",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-631a25",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20201105Z-6fba04",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-b57b6f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
