organization := "org.scalablytyped"
name := "mongoose-sequence"
version := "3.0.2-dt-20180214Z-b9df89"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-5fb050",
  "org.scalablytyped" %%% "mongodb" % "3.1-dt-20190221Z-76f226",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190224Z-d18b8d",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "std" % "3.3-6e4388")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        