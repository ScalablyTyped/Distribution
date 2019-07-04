organization := "org.scalablytyped"
name := "mongoose-paginate-v2"
version := "1.0-dt-20190227Z-64d10f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-75615b",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190531Z-e26134",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20190701Z-187b7c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190703Z-0260d9",
  "org.scalablytyped" %%% "std" % "3.5-d4a303")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        