organization := "org.scalablytyped"
name := "meteor-prime8consulting-oauth2"
version := "0.0-unknown-dt-20190322Z-aa082a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-0a8905",
  "org.scalablytyped" %%% "csstype" % "2.6.5-8a2cd0",
  "org.scalablytyped" %%% "meteor" % "1.4-dt-20190429Z-5b6369",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190606Z-b7fe68",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-c843c9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190528Z-1fde1d",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190515Z-a22f69")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        