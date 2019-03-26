organization := "org.scalablytyped"
name := "p-memoize"
version := "3.0.0-4f6c5b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "map-age-cleaner" % "0.1.3-efbe22",
  "org.scalablytyped" %%% "mem" % "4.2.0-ec7f1a",
  "org.scalablytyped" %%% "p-defer" % "1.0-dt-20181123Z-259ea3",
  "org.scalablytyped" %%% "p-is-promise" % "2.0-dt-20181215Z-a88bf4",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        