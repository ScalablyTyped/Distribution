organization := "org.scalablytyped"
name := "p-any"
version := "2.0.0-a4dddf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aggregate-error" % "2.2.0-b44f5b",
  "org.scalablytyped" %%% "clean-stack" % "1.3-dt-20180214Z-272cb8",
  "org.scalablytyped" %%% "indent-string" % "3.2-dt-20181210Z-22a521",
  "org.scalablytyped" %%% "p-cancelable" % "1.1.0-f198d5",
  "org.scalablytyped" %%% "p-some" % "4.0.0-55aa3f",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "type-fest" % "0.1.0-207b13")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        