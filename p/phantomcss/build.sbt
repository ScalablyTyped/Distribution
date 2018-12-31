organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20180214Z-71dd93"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180214Z-507ebc",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20180214Z-44d976",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20180214Z-7c02de",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        