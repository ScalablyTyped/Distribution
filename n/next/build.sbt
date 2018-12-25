organization := "org.scalablytyped"
name := "next"
version := "7.0-dt-20181222Z-f0a6d2"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-47e07f",
  "org.scalablytyped" %%% "csstype" % "2.5.8-28635b",
  "org.scalablytyped" %%% "next-server" % "7.0-dt-20181115Z-334536",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-e45326",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181119Z-d6edb6",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-3109dd",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181220Z-b38950",
  "org.scalablytyped" %%% "react-loadable" % "5.4-dt-20181225Z-ec1d53",
  "org.scalablytyped" %%% "source-map" % "0.7.3-242c07",
  "org.scalablytyped" %%% "std" % "3.2.2-669a73",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-48b551",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-603838",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-7f54f8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        