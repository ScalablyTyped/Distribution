organization := "com.scalablytyped"
name := "node-vault"
version := "0.5-dt-20180910Z-0eaa6a"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-2bf221",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-52b360",
  "com.scalablytyped" %%% "mustache" % "0.8.4-dt-20181027Z-13f4df",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181203Z-7004b3",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-67a93f",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-65a037",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        