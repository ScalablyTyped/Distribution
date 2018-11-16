organization := "com.scalablytyped"
name := "microsoft-live-connect"
version := "v5.0-dt-20181102Z-fc3f19"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "com.scalablytyped" %%% "winjs" % "4.4-dt-20181102Z-d7427f",
  "com.scalablytyped" %%% "winrt" % "0.0-unknown-dt-20181102Z-3e40e9",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        