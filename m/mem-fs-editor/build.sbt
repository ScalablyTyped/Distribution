organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-04cc95"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-7bedc6",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-26d559",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-1db2e3",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-e56e4c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-14d596")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        