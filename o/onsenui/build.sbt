organization := "org.scalablytyped"
name := "onsenui"
version := "2.10.6-8c8be0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-6e46e7",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-94697d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-777de3",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-6e7f88",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-88fa47",
  "org.scalablytyped" %%% "gulp-protractor" % "v1.0.0-dt-20180214Z-ee6de5",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190212Z-84b1b4",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-573913",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-a58d53",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190212Z-65237c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        