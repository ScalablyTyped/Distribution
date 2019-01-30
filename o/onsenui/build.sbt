organization := "org.scalablytyped"
name := "onsenui"
version := "2.10.6-47677d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-1a6d3e",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-8101a4",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e3ca52",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-136fc4",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-078d32",
  "org.scalablytyped" %%% "gulp-protractor" % "v1.0.0-dt-20180214Z-220571",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-db2a02",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190128Z-23a585",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180217Z-d0d6d1",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-8cb637",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-aecc29",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190128Z-2a7f5d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        