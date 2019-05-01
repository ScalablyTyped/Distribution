organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-f6ce01"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-8c72b2",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-f6c341",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-ac870b",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-1e3cff",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-d2c68c",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-181257",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-407536",
  "org.scalablytyped" %%% "std" % "3.4-495f93",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-d1578d")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        