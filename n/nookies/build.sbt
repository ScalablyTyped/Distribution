organization := "org.scalablytyped"
name := "nookies"
version := "1.1-dt-20181020Z-170f72"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-940dc4",
  "org.scalablytyped" %%% "cookie" % "0.3-dt-20181120Z-aad509",
  "org.scalablytyped" %%% "csstype" % "2.5.8-eb24f4",
  "org.scalablytyped" %%% "next" % "7.0-dt-20181116Z-c27d00",
  "org.scalablytyped" %%% "next-server" % "7.0-dt-20181116Z-36c82e",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20181120Z-d32d36",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-32d5ea",
  "org.scalablytyped" %%% "react" % "16.7-dt-20181213Z-7d04f8",
  "org.scalablytyped" %%% "react-loadable" % "5.4-dt-20181123Z-b11851",
  "org.scalablytyped" %%% "source-map" % "0.7.3-a4132b",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-ea4dd1",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-d845d1",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181210Z-208f59")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        