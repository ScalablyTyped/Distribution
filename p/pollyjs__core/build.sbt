organization := "org.scalablytyped"
name := "pollyjs__core"
version := "1.3-dt-20181128Z-e1d0cd"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "pollyjs__adapter" % "1.3-dt-20181203Z-e2ebdb",
  "org.scalablytyped" %%% "pollyjs__persister" % "1.3-dt-20181203Z-dad17c",
  "org.scalablytyped" %%% "pollyjs__utils" % "1.3-dt-20181203Z-f72a05",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        