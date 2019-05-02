organization := "org.scalablytyped"
name := "mongoose-mock"
version := "0.4.0-dt-20190322Z-66340f"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-7ceee1",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190501Z-a23da1",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190426Z-c99721",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190502Z-d681c7",
  "org.scalablytyped" %%% "std" % "3.4-495f93")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        