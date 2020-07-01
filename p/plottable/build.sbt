organization := "org.scalablytyped"
name := "plottable"
version := "3.9.0-26cc6b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20200515Z-9ade2c",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20200515Z-80eb11",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200515Z-edd1d8",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20200515Z-0df0ac",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20200515Z-e123ad",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200515Z-2c7cce",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200624Z-697568",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-5527ac")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
