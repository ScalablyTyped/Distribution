organization := "com.scalablytyped"
name := "meow"
version := "5.x-dt-20181009Z-59e5c8"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "minimist" % "1.2.0-dt-20180910Z-dd566d",
  "com.scalablytyped" %%% "minimist-options" % "3.0-dt-20180910Z-3029f8",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        