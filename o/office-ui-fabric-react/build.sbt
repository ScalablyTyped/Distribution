organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "7.25.0-1140b3"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f01b27",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190417Z-f929bc",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-93079a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "uifabric__foundation" % "7.0.3-4b8ec5",
  "org.scalablytyped" %%% "uifabric__icons" % "7.1.1-2c557b",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.4.0-a9a3f0",
  "org.scalablytyped" %%% "uifabric__styling" % "7.5.0-75326d",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.0.7-7828d1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        