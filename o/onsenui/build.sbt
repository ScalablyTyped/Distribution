organization := "org.scalablytyped"
name := "onsenui"
version := "2.10.6-7db4c5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-31fd22",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-02a18b",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-37315a",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-215d9b",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-c1b20d",
  "org.scalablytyped" %%% "gulp-protractor" % "v1.0.0-dt-20180214Z-318279",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-db2a02",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180217Z-7d2474",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-8cb637",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-4938db",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190128Z-336dca")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        