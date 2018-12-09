organization := "org.scalablytyped"
name := "mobx-apollo"
version := "0.0-dt-20181018Z-38e19d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.21-b12cab",
  "org.scalablytyped" %%% "apollo-client" % "2.4.7-788f97",
  "org.scalablytyped" %%% "apollo-link" % "1.2.4-d81515",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.11-293f53",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.26-6eebd1",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-505dae",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e3ebb0",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180910Z-671f25",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.11-74d34a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        