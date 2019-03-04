organization := "org.scalablytyped"
name := "microsoft-live-connect"
version := "v5.0-dt-20181003Z-2d2813"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "winjs" % "4.4-dt-20180214Z-8fbbd9",
  "org.scalablytyped" %%% "winrt" % "0.0-unknown-dt-20180214Z-55c464")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        