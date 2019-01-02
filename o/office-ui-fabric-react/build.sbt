organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "6.118.2-94bb14"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-a13970",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.51-dd0374",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-89199d",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-3dff88",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-8054fe",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "tslib" % "1.9.3-5f911d",
  "org.scalablytyped" %%% "uifabric__icons" % "6.3.0-55791c",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.15.0-c0ce38",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-debd14",
  "org.scalablytyped" %%% "uifabric__styling" % "6.39.0-b6b05a",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.27.1-8b38fe")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        