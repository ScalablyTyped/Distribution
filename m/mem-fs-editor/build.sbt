organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "5.1-dt-20190217Z-0af856"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "ejs" % "2.6-dt-20190223Z-c837d5",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20180920Z-f612e2",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-3677b4",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20180214Z-6de98a",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20190409Z-4882b9")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        