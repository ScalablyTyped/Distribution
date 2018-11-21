organization := "com.scalablytyped"
name := "microsoft-live-connect"
version := "v5.0-dt-20181004Z-8095fb"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "winjs" % "4.4-dt-20180910Z-849ede",
  "com.scalablytyped" %%% "winrt" % "0.0-unknown-dt-20180910Z-7ca4df",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        