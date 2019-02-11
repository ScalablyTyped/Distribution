organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20181117Z-6419c6"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-2d42fd",
  "org.scalablytyped" %%% "buffer" % "5.2.1-611da5",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-945834",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-c73b68",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-416da3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-3468e4",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-c26d38")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        