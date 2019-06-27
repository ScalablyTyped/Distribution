organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-feca20"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-118751",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-646c38",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-f51f62",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-058182",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-3080d7",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-6ffed1",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190626Z-4ba0df",
  "org.scalablytyped" %%% "std" % "3.5-d4a303",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-c50442")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        