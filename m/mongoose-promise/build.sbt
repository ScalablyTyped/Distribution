organization := "org.scalablytyped"
name := "mongoose-promise"
version := "4.5.4-dt-20180910Z-59ca02"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180910Z-9880e9",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181203Z-b7de20",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20181213Z-694731",
  "org.scalablytyped" %%% "mpromise" % "0.5.4-dt-20180910Z-b40bec",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-21ad57",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        