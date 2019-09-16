organization := "org.scalablytyped"
name := "mobx-apollo"
version := "0.0-dt-20190827Z-4961ff"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-4d1d5a",
  "org.scalablytyped" %%% "apollo-client" % "2.6.4-905f06",
  "org.scalablytyped" %%% "apollo-link" % "1.2.12-74f376",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.2-e48ea5",
  "org.scalablytyped" %%% "graphql" % "14.5.6-6d234a",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-66d5ca",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.19-8a9e63")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        