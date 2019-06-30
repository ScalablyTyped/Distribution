organization := "org.scalablytyped"
name := "nivo__line"
version := "0.58.0-defd07"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "csstype" % "2.6.5-e47d18",
  "org.scalablytyped" %%% "nivo__axes" % "0.58.0-6b3c08",
  "org.scalablytyped" %%% "nivo__colors" % "0.58.0-a2236d",
  "org.scalablytyped" %%% "nivo__core" % "0.58.0-37db13",
  "org.scalablytyped" %%% "nivo__legends" % "0.58.0-cfe62c",
  "org.scalablytyped" %%% "nivo__scales" % "0.58.0-e439fa",
  "org.scalablytyped" %%% "nivo__tooltip" % "0.58.0-71a1ef",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-2a42a7",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190621Z-9e424f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        