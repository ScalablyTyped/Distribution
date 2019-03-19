organization := "org.scalablytyped"
name := "p-memoize"
version := "3.0.0-e399ec"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "map-age-cleaner" % "0.1.3-66fcac",
  "org.scalablytyped" %%% "mem" % "4.2.0-c7ba53",
  "org.scalablytyped" %%% "p-defer" % "1.0-dt-20181123Z-f08c33",
  "org.scalablytyped" %%% "p-is-promise" % "2.0-dt-20181215Z-d43763",
  "org.scalablytyped" %%% "std" % "3.3-ec2942")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        