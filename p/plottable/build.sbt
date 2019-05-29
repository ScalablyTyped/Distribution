organization := "org.scalablytyped"
name := "plottable"
version := "3.8.6-c2c54c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-collection" % "1.0-dt-20190212Z-9af696",
  "org.scalablytyped" %%% "d3-path" % "1.0-dt-20190212Z-646c38",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-02a8fd",
  "org.scalablytyped" %%% "d3-shape" % "1.3-dt-20190212Z-19af2e",
  "org.scalablytyped" %%% "d3-time" % "1.0-dt-20190212Z-c9ddc4",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-3d3fd8",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190523Z-e414eb",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "typesettable" % "4.1.0-dcdcf1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        