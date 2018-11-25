organization := "com.scalablytyped"
name := "optimize-css-assets-webpack-plugin"
version := "1.3-dt-20180910Z-7c3fed"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "anymatch" % "1.3-dt-20180910Z-335bc8",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "source-map" % "0.7.3-2a06d1",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180910Z-aab6b2",
  "com.scalablytyped" %%% "uglify-js" % "3.0-dt-20181018Z-3bc20d",
  "com.scalablytyped" %%% "webpack" % "4.4-dt-20181116Z-1b7f4c",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        