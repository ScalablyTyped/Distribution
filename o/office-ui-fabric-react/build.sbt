organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "7.64.2-493bbd"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-a93afc",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-5cddf8",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191123Z-d1d56f",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "uifabric__foundation" % "7.5.0-bce854",
  "org.scalablytyped" %%% "uifabric__icons" % "7.3.0-8a7ddf",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.8.1-e63d88",
  "org.scalablytyped" %%% "uifabric__styling" % "7.7.3-7a946d",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.5.0-291d74")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        