organization := "org.scalablytyped"
name := "p-memoize"
version := "3.1.0-b65130"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "map-age-cleaner" % "0.1.3-0eb2de",
  "org.scalablytyped" %%% "mem" % "4.3.0-b7431c",
  "org.scalablytyped" %%% "mimic-fn" % "2.1.0-87c732",
  "org.scalablytyped" %%% "p-defer" % "2.1.0-0572e1",
  "org.scalablytyped" %%% "p-is-promise" % "2.1.0-2fac82",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        