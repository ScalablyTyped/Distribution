organization := "org.scalablytyped"
name := "nookies"
version := "1.1-dt-20181019Z-b7a18a"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-c183c0",
  "org.scalablytyped" %%% "cookie" % "0.3-dt-20181113Z-f13dc1",
  "org.scalablytyped" %%% "csstype" % "2.5.8-82546d",
  "org.scalablytyped" %%% "next" % "7.0-dt-20181222Z-3e791d",
  "org.scalablytyped" %%% "next-server" % "7.0-dt-20181115Z-bed4ae",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-2aa425",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-3967d2",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-ff1a88",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-8bb0ba",
  "org.scalablytyped" %%% "react-loadable" % "5.4-dt-20181225Z-94b3fd",
  "org.scalablytyped" %%% "source-map" % "0.7.3-8fe344",
  "org.scalablytyped" %%% "std" % "3.2.2-f3cc98",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-e50996",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-bd0e3f",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-f6f4be")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        