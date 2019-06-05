organization := "org.scalablytyped"
name := "mongoose-paginate-v2"
version := "1.0-dt-20190227Z-75e45b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-62eb56",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190531Z-453d22",
  "org.scalablytyped" %%% "mongoose" % "5.5.1-dt-20190603Z-f9974c",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190530Z-a47442",
  "org.scalablytyped" %%% "std" % "3.5-f010ac")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        