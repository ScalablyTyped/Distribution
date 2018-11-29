organization := "com.scalablytyped"
name := "microsoft-live-connect"
version := "v5.0-dt-20181004Z-583ec6"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "com.scalablytyped" %%% "winjs" % "4.4-dt-20180910Z-2f1bfb",
  "com.scalablytyped" %%% "winrt" % "0.0-unknown-dt-20180910Z-d7d18d",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        