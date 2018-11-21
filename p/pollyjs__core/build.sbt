organization := "com.scalablytyped"
name := "pollyjs__core"
version := "1.2-dt-20181120Z-b2631f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "pollyjs__adapter" % "1.2-dt-20181120Z-7e2680",
  "com.scalablytyped" %%% "pollyjs__persister" % "1.2-dt-20181120Z-e58241",
  "com.scalablytyped" %%% "pollyjs__utils" % "1.2-dt-20181120Z-10646a",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        