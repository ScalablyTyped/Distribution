organization := "org.scalablytyped"
name := "mobx-apollo"
version := "0.0-dt-20181017Z-25f246"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.22-2a3c2e",
  "org.scalablytyped" %%% "apollo-client" % "2.4.8-6fc0b7",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-b691e2",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.13-0f584c",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-8fb33a",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-353ee5",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-54489a",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-dc48cb",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-9c6819",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-80038a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        