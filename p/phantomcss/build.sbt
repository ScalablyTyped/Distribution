organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20190322Z-4d6805"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-68dc14",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20190322Z-7b2d4e",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20190322Z-3338a8",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        