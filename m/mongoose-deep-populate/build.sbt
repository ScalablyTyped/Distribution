organization := "org.scalablytyped"
name := "mongoose-deep-populate"
version := "2.0.3-dt-20190322Z-14d4cb"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-4c1f17",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190419Z-45b17a",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190408Z-0a5882",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190419Z-3f0246",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        