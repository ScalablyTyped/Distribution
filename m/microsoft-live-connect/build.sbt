organization := "org.scalablytyped"
name := "microsoft-live-connect"
version := "v5.0-dt-20181003Z-85098f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "winjs" % "4.4-dt-20180214Z-21d2da",
  "org.scalablytyped" %%% "winrt" % "0.0-unknown-dt-20180214Z-53280f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        