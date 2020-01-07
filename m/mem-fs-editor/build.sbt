organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-0154c4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ejs" % "3.0-dt-20191205Z-06f5d7",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-58ecfc",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-0d5ac1",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-d2df64",
  "org.scalablytyped" %%% "node" % "13.1-dt-20200103Z-51871a",
  "org.scalablytyped" %%% "std" % "3.7-b6d959",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-2f6a4a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        