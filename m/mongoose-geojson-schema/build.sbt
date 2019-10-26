organization := "org.scalablytyped"
name := "mongoose-geojson-schema"
version := "2.1-dt-20191003Z-bcac2d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-f9f540",
  "org.scalablytyped" %%% "mongodb" % "3.3-dt-20191007Z-c0909c",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20191022Z-b5b816",
  "org.scalablytyped" %%% "node" % "12.11-dt-20191024Z-c10572",
  "org.scalablytyped" %%% "std" % "3.6-b80e7a")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        