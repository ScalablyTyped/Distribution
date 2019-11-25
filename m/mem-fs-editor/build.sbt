organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-6e4b44"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-cd1e6f",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-b40f63",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-f8bafc",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-bf1299",
  "org.scalablytyped" %%% "node" % "12.12-dt-20191123Z-382692",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20191106Z-e0bd5f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        