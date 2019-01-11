organization := "org.scalablytyped"
name := "onsenui"
version := "2.10.6-6b1f9e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "chokidar" % "1.7-dt-20180226Z-c4aa11",
  "org.scalablytyped" %%% "core-js" % "2.5-dt-20180921Z-32e609",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-e3598d",
  "org.scalablytyped" %%% "glob-stream" % "v6.1.0-dt-20180214Z-e44fee",
  "org.scalablytyped" %%% "gulp" % "4.0-dt-20180214Z-bc4522",
  "org.scalablytyped" %%% "gulp-protractor" % "v1.0.0-dt-20180214Z-97725a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-696dbe",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2be335",
  "org.scalablytyped" %%% "std" % "3.2.2-2926f1",
  "org.scalablytyped" %%% "undertaker" % "1.2-dt-20180217Z-ebc102",
  "org.scalablytyped" %%% "undertaker-registry" % "1.0-dt-20180214Z-5cc55c",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-53ab16",
  "org.scalablytyped" %%% "vinyl-fs" % "2.4-dt-20181121Z-78d8cb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        