organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-21fb97"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-20dc0e",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-e7ca07",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190710Z-2307af",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-340848",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-75922a",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-2e351b",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190708Z-b8e808",
  "org.scalablytyped" %%% "std" % "3.5-983486",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-93466a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        