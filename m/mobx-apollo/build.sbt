organization := "org.scalablytyped"
name := "mobx-apollo"
version := "0.0-dt-20181017Z-491755"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "apollo-cache" % "1.1.22-a72459",
  "org.scalablytyped" %%% "apollo-client" % "2.4.8-724765",
  "org.scalablytyped" %%% "apollo-link" % "1.2.6-512db1",
  "org.scalablytyped" %%% "apollo-link-dedup" % "1.0.13-6d593a",
  "org.scalablytyped" %%% "apollo-utilities" % "1.0.27-c80c1a",
  "org.scalablytyped" %%% "fast-json-stable-stringify" % "2.0-dt-20181224Z-42ebaa",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181231Z-cb936f",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "symbol-observable" % "1.2.0-e21f3d",
  "org.scalablytyped" %%% "zen-observable" % "0.8-dt-20180618Z-1f070e",
  "org.scalablytyped" %%% "zen-observable-ts" % "0.8.13-94c887")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        