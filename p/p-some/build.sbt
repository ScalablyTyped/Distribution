organization := "org.scalablytyped"
name := "p-some"
version := "4.0.0-8878c7"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aggregate-error" % "2.2.0-fa0cc2",
  "org.scalablytyped" %%% "clean-stack" % "1.3-dt-20180214Z-8b7933",
  "org.scalablytyped" %%% "indent-string" % "3.2-dt-20181210Z-7e2353",
  "org.scalablytyped" %%% "p-cancelable" % "1.1.0-f0fb96",
  "org.scalablytyped" %%% "std" % "3.3-14e863")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        