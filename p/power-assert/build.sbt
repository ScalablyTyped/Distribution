organization := "org.scalablytyped"
name := "power-assert"
version := "1.5.0-dt-20180410Z-2a8ff5"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "empower" % "1.2.1-dt-20180214Z-34662b",
  "org.scalablytyped" %%% "power-assert-formatter" % "1.4.1-dt-20180214Z-7ce9c6",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        