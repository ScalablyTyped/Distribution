organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-a08d1a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-2916f6",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-ce8e08",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-8d90ce",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e6c927",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190330Z-7c1cfd",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-831268")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        