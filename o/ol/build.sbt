organization := "org.scalablytyped"
name := "ol"
version := "5.3-dt-20190524Z-c7d2b3"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "arcgis-rest-api" % "10.4-dt-20190213Z-8cfbe7",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-9c6dd8",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-3686ec")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        