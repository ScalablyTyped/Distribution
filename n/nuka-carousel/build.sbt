organization := "org.scalablytyped"
name := "nuka-carousel"
version := "4.5.3-d88a78"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "d3-ease" % "1.0-dt-20190212Z-2265bf",
  "org.scalablytyped" %%% "exenv" % "1.2-dt-20180321Z-c21b52",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190318Z-f6d9fe",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190312Z-6f0f1a",
  "org.scalablytyped" %%% "react-dom" % "16.8-dt-20190213Z-15e686",
  "org.scalablytyped" %%% "react-lifecycles-compat" % "3.0-dt-20190116Z-51f53d",
  "org.scalablytyped" %%% "react-move" % "5.2.1-464753",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        