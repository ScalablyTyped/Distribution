organization := "org.scalablytyped"
name := "nvd3"
version := "1.8.1-dt-20190322Z-6bb171"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "d3-dispatch" % "1.0-dt-20190212Z-d34671",
  "org.scalablytyped" %%% "d3-selection" % "1.4-dt-20190212Z-037d61",
  "org.scalablytyped" %%% "d3-transition" % "1.1-dt-20190212Z-0cc4da",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        