organization := "org.scalablytyped"
name := "minify"
version := "9.1-dt-20220630Z-e2be36"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "clean-css" % "4.2-dt-20221103Z-a8d24f",
  "org.scalablytyped" %%% "html-minifier-terser" % "7.0-dt-20220815Z-875eb1",
  "org.scalablytyped" %%% "jridgewell__gen-mapping" % "0.3.3-d76206",
  "org.scalablytyped" %%% "jridgewell__trace-mapping" % "0.3.18-9410d5",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "source-map" % "0.7.4-e1e422",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "terser" % "5.17.3-f351fb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
