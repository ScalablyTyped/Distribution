organization := "org.scalablytyped"
name := "pollyjs__core"
version := "1.3-dt-20181208Z-1b66bf"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "pollyjs__adapter" % "1.3-dt-20181208Z-740773",
  "org.scalablytyped" %%% "pollyjs__persister" % "1.3-dt-20181208Z-ff90e1",
  "org.scalablytyped" %%% "pollyjs__utils" % "1.3-dt-20181208Z-fa7d5b",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        