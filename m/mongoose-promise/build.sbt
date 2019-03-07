organization := "org.scalablytyped"
name := "mongoose-promise"
version := "4.5.4-dt-20180214Z-e2cf58"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-7e763d",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190225Z-a2015c",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190225Z-363d79",
  "org.scalablytyped" %%% "mpromise" % "0.5.4-dt-20180214Z-8c9516",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        