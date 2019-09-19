organization := "org.scalablytyped"
name := "nivo__stream"
version := "0.59.3-de9676"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "nivo__axes" % "0.59.2-a8cc74",
  "org.scalablytyped" %%% "nivo__colors" % "0.59.0-f866ab",
  "org.scalablytyped" %%% "nivo__core" % "0.59.1-5bb567",
  "org.scalablytyped" %%% "nivo__legends" % "0.59.1-6c71a0",
  "org.scalablytyped" %%% "nivo__scales" % "0.59.3-d7cbd4",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190917Z-53b9fb",
  "org.scalablytyped" %%% "std" % "3.6-c16502")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        