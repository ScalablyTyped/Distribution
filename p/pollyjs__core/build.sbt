organization := "org.scalablytyped"
name := "pollyjs__core"
version := "1.3-dt-20181208Z-25f0c2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "pollyjs__adapter" % "1.3-dt-20181208Z-a5d2e4",
  "org.scalablytyped" %%% "pollyjs__persister" % "1.3-dt-20181208Z-920f6a",
  "org.scalablytyped" %%% "pollyjs__utils" % "1.3-dt-20181208Z-b77512",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        