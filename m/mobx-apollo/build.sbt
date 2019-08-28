organization := "org.scalablytyped"
name := "mobx-apollo"
version := "0.0-dt-20190827Z-8f8eee"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-05de42",
  "org.scalablytyped" %%% "apollo-client" % "2.6.4-f799f9",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-f86490",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.2-2b2601",
  "org.scalablytyped" %%% "graphql" % "14.5.3-be513a",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-359560",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-002886")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        