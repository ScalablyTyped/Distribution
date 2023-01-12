organization := "org.scalablytyped"
name := "minify"
version := "9.1-dt-20220630Z-3e826f"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20221103Z-2931c8",
  "org.scalablytyped" %%% "html-minifier-terser" % "7.0-dt-20220815Z-7913cf",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-2d9eaa",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.17-ceea3a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "source-map" % "0.7.4-0d2ade",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "terser" % "5.15.1-681bb4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
