organization := "org.scalablytyped"
name := "plottable"
version := "3.9.0-635b9b"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "d3-path" % "2.0-dt-20201002Z-f8c6f6",
  "org.scalablytyped" %%% "d3-selection" % "2.0-dt-20201002Z-c00acc",
  "org.scalablytyped" %%% "d3-shape" % "2.0-dt-20201028Z-44996d",
  "org.scalablytyped" %%% "d3-time" % "2.0-dt-20201002Z-9a0554",
  "org.scalablytyped" %%% "d3-transition" % "2.0-dt-20201002Z-fcabd1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20201105Z-32c157",
  "org.scalablytyped" %%% "std" % "4.1-40053c",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-b52278")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
