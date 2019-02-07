organization := "org.scalablytyped"
name := "nuka-carousel"
version := "4.4.7-3098dc"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "d3-color" % "1.2-dt-20180520Z-a46f6d",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20180214Z-54d6e4",
  "org.scalablytyped" %%% "d3-interpolate" % "1.3-dt-20180917Z-522108",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20180912Z-09fe77",
  "org.scalablytyped" %%% "exenv" % "1.2-dt-20180321Z-860c93",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-7cfc00",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190206Z-d66e8f",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190206Z-33b48d",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-9b947d",
  "org.scalablytyped" %%% "react-move" % "2.9.1-f14b1e",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        