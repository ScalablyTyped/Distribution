organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-c0204f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ejs" % "3.0-dt-20191205Z-4968c3",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b49afb",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-1f316a",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-1967d2",
  "org.scalablytyped" %%% "node" % "13.7-dt-20200211Z-b30bde",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-4e137c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
