organization := "org.scalablytyped"
name := "monk"
version := "6.0.6-5cf3e7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20190211Z-f45878",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20190214Z-c0f3d2",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20190110Z-4c94ef",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-604ea6",
  "org.scalablytyped" %%% "object-assign" % "4.0.1-dt-20180214Z-af576a",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        