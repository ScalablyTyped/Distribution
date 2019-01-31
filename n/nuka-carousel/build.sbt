organization := "org.scalablytyped"
name := "nuka-carousel"
version := "4.4.7-5f7f49"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.5.8-36deb1",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-12ef03",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180214Z-73a9ad",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-539cf0",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-68af48",
  "org.scalablytyped" %%% "exenv" % "1.2-dt-20180321Z-c49f58",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-40209e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-e51e1e",
  "org.scalablytyped" %%% "react" % "16.7-dt-20190128Z-cfd22c",
  "org.scalablytyped" %%% "react-dom" % "16.0-dt-20181127Z-40bb02",
  "org.scalablytyped" %%% "react-move" % "2.9.0-be6b60",
  "org.scalablytyped" %%% "std" % "3.2.4-2926f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        