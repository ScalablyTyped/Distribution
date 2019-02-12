organization := "org.scalablytyped"
name := "mongoose-simple-random"
version := "0.4-dt-20180723Z-878f86"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180721Z-241230",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-654dc0",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190131Z-a0a69c",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190211Z-6a64f2",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        