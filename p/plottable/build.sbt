organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-66acc2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-286cf1",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-646c38",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-8a2abc",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-721b66",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-63d757",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-71d1d1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190606Z-4abba9",
  "org.scalablytyped" %%% "std" % "3.5-f010ac",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-b1521a")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        