organization := "org.scalablytyped"
name := "onsenui"
version := "2.10.8-971bce"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-6f800f",
  "org.scalablytyped" %%% "braces" % "2.3-dt-20180214Z-306649",
  "org.scalablytyped" %%% "chokidar" % "2.1.5-6fb4b0",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-0940d0",
  "org.scalablytyped" %%% "fsevents" % "1.1-dt-20180214Z-e93f50",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ce8e08",
  "org.scalablytyped" %%% "glob-parent" % "3.1-dt-20190329Z-819655",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20190322Z-6a3a24",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20190405Z-26813e",
  "org.scalablytyped" %%% "gulp-protractor" % "v1.0.0-dt-20190322Z-39c43f",
  "org.scalablytyped" %%% "inherits" % "0.0-unknown-dt-20190322Z-75670b",
  "org.scalablytyped" %%% "is-binary-path" % "2.0-dt-20180214Z-900f29",
  "org.scalablytyped" %%% "is-glob" % "4.0-dt-20190329Z-4226a6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "normalize-path" % "3.0-dt-20181225Z-45086b",
  "org.scalablytyped" %%% "path-is-absolute" % "1.0-dt-20180214Z-ae48af",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20190405Z-3bdff6",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-8c5417",
  "org.scalablytyped" %%% "upath" % "1.1.2-adf450",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-831268",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20190228Z-924b67")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        