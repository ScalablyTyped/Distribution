organization := "org.scalablytyped"
name := "mongoose-paginate"
version := "5.0.0-dt-20181121Z-a7842b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-ea4472",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190307Z-20945c",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190225Z-44a68b",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190307Z-7720a8",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        