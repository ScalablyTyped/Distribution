organization := "org.scalablytyped"
name := "mongoose-sequence"
version := "3.0.2-dt-20180214Z-f4ba07"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-4615b8",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-dbb2b3",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190131Z-632dde",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-8da1df",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        