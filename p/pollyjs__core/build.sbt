organization := "com.scalablytyped"
name := "pollyjs__core"
version := "1.2-dt-20181120Z-431a57"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "pollyjs__adapter" % "1.2-dt-20181120Z-0c4d68",
  "com.scalablytyped" %%% "pollyjs__persister" % "1.2-dt-20181120Z-67872f",
  "com.scalablytyped" %%% "pollyjs__utils" % "1.2-dt-20181120Z-f03863",
  "com.scalablytyped" %%% "std" % "3.2.1-4b40fd",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        