organization := "org.scalablytyped"
name := "minify"
version := "9.1-dt-20220630Z-4d519e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20220921Z-650c8a",
  "org.scalablytyped" %%% "html-minifier-terser" % "7.0-dt-20220815Z-29cad2",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-dfc28b",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.15-7a644b",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e0c113",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "terser" % "5.15.0-3c5d1c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
