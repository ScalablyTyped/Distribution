organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "4.0-dt-20180910Z-dcb498"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181203Z-696e57",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-274633",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20180910Z-8e2e4f",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-c002a7",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-1dc2db")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        