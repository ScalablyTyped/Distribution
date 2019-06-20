organization := "org.scalablytyped"
name := "mongoose-geojson-schema"
version := "2.1-dt-20180214Z-58e2a8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-0023ac",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190531Z-465baf",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20190620Z-b579c6",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190611Z-b8909f",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        