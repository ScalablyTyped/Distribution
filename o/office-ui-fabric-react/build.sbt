organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "7.29.2-5fa5fe"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-f980df",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190903Z-bd378a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20190815Z-53b9fb",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "uifabric__example-data" % "7.0.1-fd3153",
  "org.scalablytyped" %%% "uifabric__foundation" % "7.3.1-fbacd6",
  "org.scalablytyped" %%% "uifabric__icons" % "7.1.3-d4c183",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.5.1-7273d8",
  "org.scalablytyped" %%% "uifabric__styling" % "7.6.2-59e0d3",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.0.9-84cf66")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        