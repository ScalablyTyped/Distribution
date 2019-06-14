organization := "org.scalablytyped"
name := "meteor"
version := "1.4-dt-20190429Z-994cf5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-07b727",
  "org.scalablytyped" %%% "csstype" % "2.6.5-3bfbc5",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-76ef23",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-4b3bf2",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190613Z-62c565",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20190612Z-08b48f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        