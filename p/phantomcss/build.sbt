organization := "com.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20180910Z-0151bc"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "casperjs" % "1.1-dt-20180910Z-c4f6af",
  "com.scalablytyped" %%% "phantomjs" % "1.9-dt-20180910Z-c4d831",
  "com.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20180910Z-3e1fec",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        