organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "7.56.2-8a1688"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "csstype" % "2.6.6-550e52",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190924Z-08cc8a",
  "org.scalablytyped" %%% "react" % "16.9-dt-20191025Z-9e835e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "uifabric__foundation" % "7.4.4-3e4377",
  "org.scalablytyped" %%% "uifabric__icons" % "7.3.0-7cda23",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "7.8.0-a0196d",
  "org.scalablytyped" %%% "uifabric__styling" % "7.7.2-0d0152",
  "org.scalablytyped" %%% "uifabric__utilities" % "7.4.0-8924aa")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        