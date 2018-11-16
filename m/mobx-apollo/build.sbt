organization := "com.scalablytyped"
name := "mobx-apollo"
version := "0.0-dt-20181102Z-97175d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "apollo-cache" % "1.1.20-7180f1",
  "com.scalablytyped" %%% "apollo-client" % "2.4.5-3f08a7",
  "com.scalablytyped" %%% "apollo-link" % "1.2.3-373593",
  "com.scalablytyped" %%% "apollo-link-dedup" % "1.0.10-d9084c",
  "com.scalablytyped" %%% "apollo-utilities" % "1.0.25-13c381",
  "com.scalablytyped" %%% "graphql" % "14.0-dt-20181102Z-c82035",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "symbol-observable" % "1.2.0-998bd5",
  "com.scalablytyped" %%% "zen-observable" % "0.8-dt-20181102Z-e5f69d",
  "com.scalablytyped" %%% "zen-observable-ts" % "0.8.10-c8cd90",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        