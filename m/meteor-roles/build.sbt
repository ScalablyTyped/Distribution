organization := "org.scalablytyped"
name := "meteor-roles"
version := "1.2.14-dt-20180910Z-645257"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-564d85",
  "org.scalablytyped" %%% "csstype" % "2.5.8-eb24f4",
  "org.scalablytyped" %%% "meteor" % "1.4-dt-20181020Z-b51258",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-32d5ea",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-7d04f8",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "underscore" % "1.8-dt-20180910Z-1e442c")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        