organization := "org.scalablytyped"
name := "microsoft-live-connect"
version := "v5.0-dt-20190322Z-cee1dd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "winjs" % "4.4-dt-20190322Z-1ee7f6",
  "org.scalablytyped" %%% "winrt" % "0.0-unknown-dt-20190322Z-b38ba6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        