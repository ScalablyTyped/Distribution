organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-29271c"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-25dbf2",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-3ec9ba",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-9d2406",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-c1e405",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-690d63")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        