organization := "org.scalablytyped"
name := "p-settle"
version := "3.1.0-d8163c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "p-limit" % "2.2.0-5d79db",
  "org.scalablytyped" %%% "p-reflect" % "2.1.0-a24f66",
  "org.scalablytyped" %%% "p-try" % "2.2.0-037832",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        