organization := "org.scalablytyped"
name := "onsenui"
version := "2.10.6-f4dd6d"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180910Z-da627d",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180927Z-2f8c45",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-eb50b6",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180910Z-fad80e",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180910Z-7da2c7",
  "org.scalablytyped" %%% "gulp-protractor" % "v1.0.0-dt-20180910Z-3c888d",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-45414c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-df5d12",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180910Z-d72e94",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180910Z-0917f9",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-816b63",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-7f123e")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        