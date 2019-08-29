organization := "org.scalablytyped"
name := "ol"
version := "5.3-dt-20190813Z-b2ac53"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "arcgis-rest-api" % "10.4-dt-20190213Z-b39728",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190319Z-2af848",
  "org.scalablytyped" %%% "std" % "3.6-c16502",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20190213Z-ecb67b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        