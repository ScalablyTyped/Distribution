organization := "org.scalablytyped"
name := "onsenui"
version := "2.10.6-2cf069"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-0da485",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-96442c",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-790699",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-289c4c",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-bad7e5",
  "org.scalablytyped" %%% "gulp-protractor" % "v1.0.0-dt-20180214Z-1fc34b",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-7791d7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180217Z-7860ef",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-f13c75",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-29c74e",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-80e040")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        