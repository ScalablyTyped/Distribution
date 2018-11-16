organization := "com.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20181102Z-f65357"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "casperjs" % "1.1-dt-20181102Z-239177",
  "com.scalablytyped" %%% "phantomjs" % "1.9-dt-20181102Z-aad41d",
  "com.scalablytyped" %%% "resemblejs" % "v1.3.0-dt-20181102Z-cd443f",
  "com.scalablytyped" %%% "std" % "3.1.6-34214f",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        