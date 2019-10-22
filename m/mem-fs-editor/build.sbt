organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-5a4e54"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-770295",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-273fc3",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-0e31ee",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-4b5d2e",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191021Z-a8dc6e",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-e4e569")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        