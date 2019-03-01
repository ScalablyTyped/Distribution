organization := "org.scalablytyped"
name := "pollyjs__core"
version := "2.3-dt-20190227Z-d071f5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "pollyjs__adapter" % "2.0-dt-20190131Z-cc8586",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20190131Z-3b3e41",
  "org.scalablytyped" %%% "pollyjs__utils" % "2.0-dt-20190131Z-c900ed",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        