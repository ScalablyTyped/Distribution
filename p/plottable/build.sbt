organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-80b048"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-721ca1",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-da723e",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-1b2f80",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-2a6244",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-749b1b",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-15c2dd",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190708Z-370309",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-db01c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        