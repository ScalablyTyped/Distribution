organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-eb1679"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-324cff",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-1ca699",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-db38c1",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20191014Z-06ce6e",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-16041b",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20191029Z-3df0c6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20191126Z-536bad",
  "org.scalablytyped" %%% "std" % "3.7-1d724d",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-c9f8b0")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        