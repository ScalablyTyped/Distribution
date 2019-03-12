organization := "org.scalablytyped"
name := "pollyjs__core"
version := "2.3-dt-20190227Z-da2c6f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "pollyjs__adapter" % "2.0-dt-20190131Z-ea5187",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20190131Z-f747f2",
  "org.scalablytyped" %%% "pollyjs__utils" % "2.0-dt-20190131Z-32d02c",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        