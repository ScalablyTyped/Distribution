organization := "org.scalablytyped"
name := "mobx-apollo"
version := "0.0-dt-20181017Z-da2a5f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.2.1-fc1278",
  "org.scalablytyped" %%% "apollo-client" % "2.5.1-b75b1c",
  "org.scalablytyped" %%% "apollo-link" % "1.2.11-987548",
  "org.scalablytyped" %%% "apollo-utilities" % "1.2.1-e4bbe8",
  "org.scalablytyped" %%% "graphql" % "14.2-dt-20190329Z-3a9110",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-fe60de",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.18-6e8907")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        