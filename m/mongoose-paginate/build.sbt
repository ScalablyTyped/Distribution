organization := "org.scalablytyped"
name := "mongoose-paginate"
version := "5.0.0-dt-20181121Z-9cb054"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-2fdc37",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-e5665e",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190131Z-e33ff9",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190206Z-9f73ab",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        