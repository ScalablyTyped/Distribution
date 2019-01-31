organization := "org.scalablytyped"
name := "pollyjs__core"
version := "1.3-dt-20181128Z-019eb7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "pollyjs__adapter" % "1.3-dt-20181203Z-f7d48d",
  "org.scalablytyped" %%% "pollyjs__persister" % "1.3-dt-20181203Z-07a5ef",
  "org.scalablytyped" %%% "pollyjs__utils" % "1.3-dt-20181203Z-50c484",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        