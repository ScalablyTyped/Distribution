organization := "org.scalablytyped"
name := "mobx-apollo"
version := "0.0-dt-20190827Z-f78634"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "apollo-cache" % "1.3.2-0bdd47",
  "org.scalablytyped" %%% "apollo-client" % "2.6.4-3fd455",
  "org.scalablytyped" %%% "apollo-link" % "1.2.13-5a2b8f",
  "org.scalablytyped" %%% "apollo-utilities" % "1.3.2-e647bb",
  "org.scalablytyped" %%% "graphql" % "14.5.8-1773a0",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-66d5ca",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.20-62290b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        