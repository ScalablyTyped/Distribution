organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-879389"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ejs" % "3.0-dt-20191205Z-e0dc9d",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-f9044d",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-b438fb",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-815e4e",
  "org.scalablytyped" %%% "node" % "13.1-dt-20191226Z-155d58",
  "org.scalablytyped" %%% "std" % "3.7-953338",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-bb6f47")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        