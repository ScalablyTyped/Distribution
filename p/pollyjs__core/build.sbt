organization := "org.scalablytyped"
name := "pollyjs__core"
version := "1.3-dt-20181128Z-9058b3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "pollyjs__adapter" % "1.3-dt-20181203Z-8a4a1b",
  "org.scalablytyped" %%% "pollyjs__persister" % "1.3-dt-20181203Z-c9c8dc",
  "org.scalablytyped" %%% "pollyjs__utils" % "1.3-dt-20181203Z-419978",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        