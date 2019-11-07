organization := "org.scalablytyped"
name := "ol"
version := "5.3-dt-20191014Z-397b21"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "arcgis-rest-api" % "10.4-dt-20190213Z-17743e",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-a51fd7",
  "org.scalablytyped" %%% "std" % "3.7-1c17cf",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-c63f3e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        