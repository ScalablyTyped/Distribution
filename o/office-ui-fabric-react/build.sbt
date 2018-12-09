organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "6.111.1-ee48ce"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-b451f0",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.47-afef21",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181208Z-87c4ee",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181203Z-d83ef6",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181122Z-d04ae5",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b",
  "org.scalablytyped" %%% "tslib" % "1.9.3-cb7890",
  "org.scalablytyped" %%% "uifabric__icons" % "6.3.0-41b5e8",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.15.0-5de8f1",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-e97460",
  "org.scalablytyped" %%% "uifabric__styling" % "6.38.0-619405",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.27.0-3d25d8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        