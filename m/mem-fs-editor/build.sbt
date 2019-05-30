organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-78630d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-461b08",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-f253cc",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-177405",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-ae6cfd",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-2c614a",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-9bb514")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        