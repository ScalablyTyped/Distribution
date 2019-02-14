organization := "org.scalablytyped"
name := "mongoose-promise"
version := "4.5.4-dt-20180214Z-33ef30"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-991839",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-217908",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190212Z-a9f3e7",
  "org.scalablytyped" %%% "mpromise" % "0.5.4-dt-20180214Z-083058",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190212Z-0d969a",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        