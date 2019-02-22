organization := "org.scalablytyped"
name := "mongoose-mock"
version := "0.4.0-dt-20180214Z-356a99"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-f45878",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-4c94ef",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20190216Z-a2e558",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        