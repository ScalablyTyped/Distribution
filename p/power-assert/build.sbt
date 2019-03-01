organization := "org.scalablytyped"
name := "power-assert"
version := "1.5.0-dt-20180410Z-6c6ef8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "empower" % "1.2.1-dt-20180214Z-c39922",
  "org.scalablytyped" %%% "power-assert-formatter" % "1.4.1-dt-20180214Z-7d36aa",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        