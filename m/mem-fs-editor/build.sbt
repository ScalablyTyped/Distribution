organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20181117Z-438656"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20181126Z-54a509",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-00b149",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-65c59c",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-785a8e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-18e734")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        