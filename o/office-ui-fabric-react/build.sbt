organization := "org.scalablytyped"
name := "office-ui-fabric-react"
version := "6.129.2-335d8b"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "microsoft__load-themed-styles" % "1.8.55-cb3943",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-7438ae",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190116Z-73addc",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-99d6f9",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1",
  "org.scalablytyped" %%% "tslib" % "1.9.3-688770",
  "org.scalablytyped" %%% "uifabric__icons" % "6.3.0-f2903c",
  "org.scalablytyped" %%% "uifabric__merge-styles" % "6.15.1-210007",
  "org.scalablytyped" %%% "uifabric__set-version" % "1.1.3-51e630",
  "org.scalablytyped" %%% "uifabric__styling" % "6.41.0-b436ea",
  "org.scalablytyped" %%% "uifabric__utilities" % "6.28.0-0e6651")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        