organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-353cbc"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-9060ec",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-5a8320",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-9db9f1",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-eb0cf8",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-aed162",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-d8076b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191118Z-0a5f57",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-661ae4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        