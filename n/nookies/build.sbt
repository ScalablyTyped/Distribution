organization := "org.scalablytyped"
name := "nookies"
version := "1.1-dt-20181019Z-3922a1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-92d399",
  "org.scalablytyped" %%% "cookie" % "0.3-dt-20181113Z-d6734a",
  "org.scalablytyped" %%% "csstype" % "2.5.8-ae54dc",
  "org.scalablytyped" %%% "next" % "7.0-dt-20190131Z-5e7978",
  "org.scalablytyped" %%% "next-server" % "7.0-dt-20190108Z-704dfb",
  "org.scalablytyped" %%% "node" % "10.12-dt-20190129Z-92720c",
  "org.scalablytyped" %%% "node-fetch" % "2.1-dt-20190130Z-93f77e",
  "org.scalablytyped" %%% "prop-types" % "15.5-dt-20181212Z-d610b9",
  "org.scalablytyped" %%% "react" % "16.8-dt-20190131Z-997ec6",
  "org.scalablytyped" %%% "react-loadable" % "5.5-dt-20190131Z-91b01b",
  "org.scalablytyped" %%% "source-map" % "0.7.3-4d6b96",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-3bfc94",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-faabb7",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20190116Z-9d8df8")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        