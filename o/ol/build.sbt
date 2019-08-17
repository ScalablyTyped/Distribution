organization := "org.scalablytyped"
name := "ol"
version := "5.3-dt-20190813Z-df009d"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "arcgis-rest-api" % "10.4-dt-20190213Z-a8fdbd",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-84cce8",
  "org.scalablytyped" %%% "std" % "3.5-cd493c",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-f91069")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        