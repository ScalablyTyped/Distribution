organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-0d0214"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-03a0db",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-d8d150",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-9230ad",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-5242bd",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-304e79",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-189020")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        