organization := "org.scalablytyped"
name := "minify"
version := "9.1-dt-20220630Z-bc538f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20221103Z-5d200c",
  "org.scalablytyped" %%% "html-minifier-terser" % "7.0-dt-20220815Z-13bf1a",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-96a273",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.17-39cb8a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "source-map" % "0.7.4-114bc3",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "terser" % "5.15.1-4e72e1")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
