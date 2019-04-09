organization := "org.scalablytyped"
name := "mongoose-deep-populate"
version := "2.0.3-dt-20190322Z-e10cc8"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190322Z-f5d9d3",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190307Z-11f709",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190407Z-1517b8",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        