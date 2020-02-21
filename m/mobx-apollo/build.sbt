organization := "org.scalablytyped"
name := "mobx-apollo"
version := "0.0-dt-20190827Z-a78d26"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.4-ff2a6c",
  "org.scalablytyped" %%% "apollo-client" % "2.6.8-8a4f42",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-aa671f",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.2-2b8b63",
  "org.scalablytyped" %%% "graphql" % "14.6.0-800d77",
  "org.scalablytyped" %%% "std" % "3.7-1b8369",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-b43498",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-17d6b8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
