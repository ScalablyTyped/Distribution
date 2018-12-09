organization := "org.scalablytyped"
name := "pollyjs__core"
version := "1.3-dt-20181208Z-c84a72"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "pollyjs__adapter" % "1.3-dt-20181208Z-3d1d5f",
  "org.scalablytyped" %%% "pollyjs__persister" % "1.3-dt-20181208Z-430871",
  "org.scalablytyped" %%% "pollyjs__utils" % "1.3-dt-20181208Z-2c0b0a",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        