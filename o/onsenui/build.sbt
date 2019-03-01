organization := "org.scalablytyped"
name := "onsenui"
version := "2.10.6-200bdf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-536948",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-76463f",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-eb36a4",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-a0c283",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-4fa970",
  "org.scalablytyped" %%% "gulp-protractor" % "v1.0.0-dt-20180214Z-0d8718",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-8c05a2",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190222Z-99335f",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190212Z-42d108",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-865fd4",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-55ae5b",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-a569c6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        