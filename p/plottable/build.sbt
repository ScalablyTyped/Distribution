organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-e9448b"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20200515Z-3364b2",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20200515Z-80eb11",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20200515Z-63e92d",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20200515Z-788163",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20200515Z-8b0cdd",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20200515Z-982503",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200519Z-0dc149",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-c2b985")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
