organization := "org.scalablytyped"
name := "microsoft-live-connect"
version := "v5.0-dt-20181003Z-207f47"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "winjs" % "4.4-dt-20180214Z-f2e9f6",
  "org.scalablytyped" %%% "winrt" % "0.0-unknown-dt-20180214Z-b9d8f5")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        