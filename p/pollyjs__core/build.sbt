organization := "org.scalablytyped"
name := "pollyjs__core"
version := "2.3-dt-20190227Z-5f355f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "pollyjs__adapter" % "2.0-dt-20190131Z-4027d4",
  "org.scalablytyped" %%% "pollyjs__persister" % "2.0-dt-20190131Z-33e9b4",
  "org.scalablytyped" %%% "pollyjs__utils" % "2.0-dt-20190131Z-322ac6",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        