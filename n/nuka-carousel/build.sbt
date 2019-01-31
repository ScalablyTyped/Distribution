organization := "org.scalablytyped"
name := "nuka-carousel"
version := "4.4.7-2a9c11"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-54e6ef",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180214Z-c9d3ef",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-f561a2",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-7cb093",
  "org.scalablytyped" %%% "exenv" % "1.2-dt-20180321Z-53d3da",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190131Z-997ec6",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-e377db",
  "org.scalablytyped" %%% "react-move" % "2.9.0-aeb3e6",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        