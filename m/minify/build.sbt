organization := "org.scalablytyped"
name := "minify"
version := "9.1-dt-20220630Z-086774"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20221103Z-1d9e14",
  "org.scalablytyped" %%% "html-minifier-terser" % "7.0-dt-20220815Z-1e25a8",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-b7ce48",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.17-72c66f",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "source-map" % "0.7.4-c99616",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "terser" % "5.15.1-db24d3")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
