organization := "org.scalablytyped"
name := "mobx-apollo"
version := "0.0-dt-20181017Z-176cc9"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.23-8ef58c",
  "org.scalablytyped" %%% "apollo-client" % "2.4.9-43f8f5",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-dc6387",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.13-d78e45",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-c9719d",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-c8d4b8",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20190107Z-b6e998",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-bc5916",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-5cf802",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-e9f354")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        