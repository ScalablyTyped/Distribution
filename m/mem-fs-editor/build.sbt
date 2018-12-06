organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "4.0-dt-20180910Z-e465d3"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181203Z-4b4913",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180927Z-63ba70",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20180910Z-0a4289",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180910Z-4563df",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-d9c01e",
  "org.scalablytyped" %%% "std" % "3.2.1-edfe2b",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20180910Z-a9e0db")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        