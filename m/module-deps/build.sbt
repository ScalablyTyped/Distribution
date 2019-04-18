organization := "org.scalablytyped"
name := "module-deps"
version := "6.1-dt-20181103Z-165abf"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "browser-resolve" % "0.0-unknown-dt-20190322Z-a3daf4",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190417Z-002402",
  "org.scalablytyped" %%% "resolve" % "0.0-unknown-dt-20190322Z-aebad0",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        