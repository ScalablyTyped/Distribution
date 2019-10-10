organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-2cade5"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-cb1de4",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-5f99ff",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-35aa36",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-24cccf",
  "org.scalablytyped" %%% "node" % "12.7-dt-20191008Z-8637fd",
  "org.scalablytyped" %%% "std" % "3.6-abb6d3",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-03237f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        