organization := "org.scalablytyped"
name := "nivo__line"
version := "0.55.0-ece491"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.3-225f24",
  "org.scalablytyped" %%% "nivo__axes" % "0.55.0-053af8",
  "org.scalablytyped" %%% "nivo__core" % "0.55.0-9d339e",
  "org.scalablytyped" %%% "nivo__legends" % "0.55.0-0527dd",
  "org.scalablytyped" %%% "nivo__scales" % "0.55.0-6bbb31",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-66be5f",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190429Z-19278e",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        