organization := "org.scalablytyped"
name := "p-some"
version := "4.0.0-81ba44"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aggregate-error" % "2.2.0-6457eb",
  "org.scalablytyped" %%% "clean-stack" % "1.3-dt-20180214Z-b857a2",
  "org.scalablytyped" %%% "indent-string" % "3.2-dt-20181210Z-52f01b",
  "org.scalablytyped" %%% "p-cancelable" % "1.1.0-b27b20",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        