organization := "org.scalablytyped"
name := "onsenui"
version := "2.10.6-f43239"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-2e66b8",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-3acce5",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-274633",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-db7651",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180910Z-626a45",
  "org.scalablytyped" %%% "gulp-protractor" % "v1.0.0-dt-20180910Z-ee4ac4",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-c002a7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180910Z-f16af0",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180910Z-27eca6",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-1dc2db",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-38c0c0")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        