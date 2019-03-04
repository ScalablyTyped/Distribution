organization := "org.scalablytyped"
name := "mongoose-promise"
version := "4.5.4-dt-20180214Z-e03a01"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-304401",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190221Z-d9686c",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190224Z-5ecbde",
  "org.scalablytyped" %%% "mpromise" % "0.5.4-dt-20180214Z-8c9516",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-fd0a52",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        