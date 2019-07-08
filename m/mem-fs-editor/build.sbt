organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-7275d5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-9e7653",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-9c0ed0",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-459015",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-41d0ad",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-a67e53",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-55bee9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        