organization := "org.scalablytyped"
name := "minify"
version := "9.1-dt-20220630Z-f22686"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20220921Z-819660",
  "org.scalablytyped" %%% "html-minifier-terser" % "7.0-dt-20220815Z-214265",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.2-19ea06",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.15-0eaa99",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "source-map" % "0.7.4-09b2a8",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "terser" % "5.15.0-0d8c68")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
