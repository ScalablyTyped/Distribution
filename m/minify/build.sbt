organization := "org.scalablytyped"
name := "minify"
version := "9.1-dt-20220630Z-daf8d2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20220921Z-05abd7",
  "org.scalablytyped" %%% "html-minifier-terser" % "7.0-dt-20220815Z-04ade6",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-1bda13",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.17-593426",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "source-map" % "0.7.4-942cbd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "terser" % "5.15.1-3697d4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
