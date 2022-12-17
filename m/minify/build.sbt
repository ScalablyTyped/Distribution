organization := "org.scalablytyped"
name := "minify"
version := "9.1-dt-20220630Z-f4f9d6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20221103Z-cdb3b3",
  "org.scalablytyped" %%% "html-minifier-terser" % "7.0-dt-20220815Z-0d8c8a",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-e685a5",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.17-b18a3d",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "source-map" % "0.7.4-14f7e0",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "terser" % "5.15.1-00ef42")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
