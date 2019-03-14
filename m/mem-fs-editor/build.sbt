organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-f8d4cb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-645745",
  "org.scalablytyped" %%% "buffer" % "5.2.1-dce626",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-c20989",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-55635b",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-16edf6",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-0a2b2c",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190313Z-f6d9fe",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20181121Z-b3a481")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        