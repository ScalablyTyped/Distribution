organization := "org.scalablytyped"
name := "mongoose-geojson-schema"
version := "2.1-dt-20180214Z-3398c1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-2a8886",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190515Z-e7e1ac",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20190524Z-6e7f92",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190528Z-17198b",
  "org.scalablytyped" %%% "std" % "3.4-ef47bb")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        