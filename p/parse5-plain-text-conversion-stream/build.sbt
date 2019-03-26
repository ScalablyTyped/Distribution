organization := "org.scalablytyped"
name := "parse5-plain-text-conversion-stream"
version := "5.0-dt-20180606Z-1b3737"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190325Z-000e7b",
  "org.scalablytyped" %%% "parse5" % "5.0-dt-20180611Z-a5e2e1",
  "org.scalablytyped" %%% "parse5-parser-stream" % "5.0-dt-20180606Z-36f3ac",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        