organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20180910Z-b1aed1"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180910Z-e639d9",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20180910Z-1ec4fa",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20180910Z-e50230",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        