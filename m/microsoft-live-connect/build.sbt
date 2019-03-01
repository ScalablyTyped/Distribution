organization := "org.scalablytyped"
name := "microsoft-live-connect"
version := "v5.0-dt-20181003Z-91b00e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "winjs" % "4.4-dt-20180214Z-ee06e8",
  "org.scalablytyped" %%% "winrt" % "0.0-unknown-dt-20180214Z-42bf4f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        