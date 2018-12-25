organization := "org.scalablytyped"
name := "mobx-apollo"
version := "0.0-dt-20181017Z-d55421"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.22-80c157",
  "org.scalablytyped" %%% "apollo-client" % "2.4.8-42062f",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-d4b20d",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.13-2415f0",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-52c89b",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-904c02",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181016Z-3245d4",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-43e3c6",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-76c70f",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-850d40")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        