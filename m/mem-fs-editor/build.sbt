organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-56f6fc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-2d42fd",
  "org.scalablytyped" %%% "buffer" % "5.2.1-d27a53",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-945834",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-48cb89",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-9ee995",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-029f0e",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190215Z-604ea6",
  "org.scalablytyped" %%% "std" % "3.3-0ec965",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-2f8725")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        