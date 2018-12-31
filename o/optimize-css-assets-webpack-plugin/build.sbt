organization := "org.scalablytyped"
name := "optimize-css-assets-webpack-plugin"
version := "1.3-dt-20180306Z-04f51b"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20180214Z-e20eff",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "source-map" % "0.7.3-fc8207",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20180713Z-48ad47",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20181015Z-8b616d",
  "org.scalablytyped" %%% "webpack" % "4.4-dt-20181221Z-bcc5d7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        