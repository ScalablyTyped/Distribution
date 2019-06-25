organization := "org.scalablytyped"
name := "mongoose-deep-populate"
version := "2.0.3-dt-20190322Z-4a8ba2"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-5b46fa",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190531Z-d3ff34",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20190624Z-b2f997",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190621Z-8f9d23",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        