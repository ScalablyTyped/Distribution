organization := "org.scalablytyped"
name := "onsenui"
version := "2.10.6-ac860f"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-ac28f3",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-50a955",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-63ba70",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-6b61f8",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180910Z-c88807",
  "org.scalablytyped" %%% "gulp-protractor" % "v1.0.0-dt-20180910Z-b1dad3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-4563df",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180910Z-293ef6",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180910Z-5e29a4",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-a9e0db",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-2c40dc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        