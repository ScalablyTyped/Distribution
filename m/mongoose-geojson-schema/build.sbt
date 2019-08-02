organization := "org.scalablytyped"
name := "mongoose-geojson-schema"
version := "2.1-dt-20190719Z-85c746"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-4edd5d",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190730Z-492174",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20190725Z-e65c53",
  "org.scalablytyped" %%% "node" % "12.6-dt-20190801Z-3c70c3",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        