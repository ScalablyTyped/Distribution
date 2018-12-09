organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20180910Z-dbd6cf"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20180910Z-4a4e3d",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20180910Z-7cd3db",
  "org.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20180910Z-e0cae8",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        