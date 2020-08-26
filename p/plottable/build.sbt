organization := "org.scalablytyped"
name := "plottable"
version := "3.9.0-2319dc"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20200515Z-23620d",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20200515Z-d2717d",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200707Z-7b7f3a",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20200515Z-d0cba8",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20200515Z-2fdaf9",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200515Z-06118c",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200722Z-1ab554",
  "org.scalablytyped" %%% "std" % "3.9-bafc13",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-b66e15")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
