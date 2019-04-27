organization := "org.scalablytyped"
name := "mendixmodelsdk"
version := "4.20.0-28be5a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "eventsource" % "1.1-dt-20190114Z-2d69d3",
  "org.scalablytyped" %%% "mobx" % "5.9.4-09075d",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        