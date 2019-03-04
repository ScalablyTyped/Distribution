organization := "org.scalablytyped"
name := "onsenui"
version := "2.10.6-a5a8e4"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-8b8449",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-098e24",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b3a88d",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-2438ca",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-23a763",
  "org.scalablytyped" %%% "gulp-protractor" % "v1.0.0-dt-20180214Z-86e3bf",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-f71186",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "std" % "3.3-05be79",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190212Z-828e0e",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-af3936",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-7c3560",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-e3f175")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        