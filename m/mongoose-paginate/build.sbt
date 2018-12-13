organization := "org.scalablytyped"
name := "mongoose-paginate"
version := "5.0.0-dt-20181121Z-b6eda4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180910Z-d9a75f",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181203Z-2392b9",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20181213Z-554c2c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        