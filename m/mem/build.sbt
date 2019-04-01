organization := "org.scalablytyped"
name := "mem"
version := "4.3.0-b53bfb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "map-age-cleaner" % "0.1.3-ae3418",
  "org.scalablytyped" %%% "p-defer" % "1.0-dt-20181123Z-9fb661",
  "org.scalablytyped" %%% "p-is-promise" % "2.0-dt-20181215Z-ed7ac2",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        