organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20180214Z-d3fec5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-411f2c",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20180214Z-a7b4cd",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20180214Z-20cbdb",
  "org.scalablytyped" %%% "std" % "3.3.1-6e0314")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        