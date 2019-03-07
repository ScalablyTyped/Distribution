organization := "org.scalablytyped"
name := "nuka-carousel"
version := "4.5.1-27a569"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-60f3ea",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-fa2ca4",
  "org.scalablytyped" %%% "d3-timer" % "1.0-dt-20190212Z-4323a2",
  "org.scalablytyped" %%% "exenv" % "1.2-dt-20180321Z-55beb3",
  "org.scalablytyped" %%% "kapellmeister" % "2.0.2-1f71f9",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190302Z-6be09d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-0b0b5e",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190306Z-d5c6e1",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-580844",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-d9b09e",
  "org.scalablytyped" %%% "react-move" % "5.2.0-cb12ed",
  "org.scalablytyped" %%% "std" % "3.3-05be79")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        