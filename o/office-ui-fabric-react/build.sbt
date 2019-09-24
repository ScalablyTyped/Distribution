organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "7.37.1-0b215a"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190917Z-53b9fb",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "uifabric__example-data" % "7.0.1-fd3153",
  "org.scalablytyped" %%% "uifabric__foundation" % "7.4.1-d36e8b",
  "org.scalablytyped" %%% "uifabric__icons" % "7.3.0-85871f",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.6.0-eb7c42",
  "org.scalablytyped" %%% "uifabric__styling" % "7.7.1-d9d4d7",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.1.0-882801")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        