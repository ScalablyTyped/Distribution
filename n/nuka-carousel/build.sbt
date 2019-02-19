organization := "org.scalablytyped"
name := "nuka-carousel"
version := "4.4.8-fc696c"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.2-522be0",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-54d6e4",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-09fe77",
  "org.scalablytyped" %%% "exenv" % "1.2-dt-20180321Z-860c93",
  "org.scalablytyped" %%% "kapellmeister" % "2.0.0-3db3ee",
  "org.scalablytyped" %%% "node" % "11.9-dt-20190213Z-0d969a",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20190212Z-8cdf18",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190212Z-6f64c6",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-c41725",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-4432dd",
  "org.scalablytyped" %%% "react-move" % "5.2.0-b350a7",
  "org.scalablytyped" %%% "std" % "3.3-0ec965")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        