organization := "org.scalablytyped"
name := "nookies"
version := "1.1-dt-20181019Z-a38908"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-f2620c",
  "org.scalablytyped" %%% "cookie" % "0.3-dt-20181113Z-06d34d",
  "org.scalablytyped" %%% "csstype" % "2.6.3-29f798",
  "org.scalablytyped" %%% "next" % "8.0-dt-20190318Z-8d6e5d",
  "org.scalablytyped" %%% "next-server" % "7.0-dt-20190220Z-a594aa",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190319Z-d54d74",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20190226Z-f878d0",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190314Z-6f0f1a",
  "org.scalablytyped" %%% "react-loadable" % "5.5-dt-20190131Z-d4c039",
  "org.scalablytyped" %%% "source-map" % "0.7.3-169991",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-c57887",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-ffccaa",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190316Z-c56cd1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        