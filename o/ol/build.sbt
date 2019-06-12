organization := "org.scalablytyped"
name := "ol"
version := "5.3-dt-20190524Z-acbe2f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "arcgis-rest-api" % "10.4-dt-20190213Z-e26fab",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-762b1c",
  "org.scalablytyped" %%% "std" % "3.5-c5d119",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-dfc504")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        