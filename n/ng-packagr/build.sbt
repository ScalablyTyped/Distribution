organization := "org.scalablytyped"
name := "ng-packagr"
version := "14.2.1-74d53e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.4-f472dd",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.2-35c052",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-e21828",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-5a5061",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-b71763",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-b5681a",
  "org.scalablytyped" %%% "babel__parser" % "7.19.3-2e0c60",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-3905f1",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-eae752",
  "org.scalablytyped" %%% "babel__types" % "7.19.3-af77a5",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-0adf37",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-abdbb9",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-a83138",
  "org.scalablytyped" %%% "esbuild" % "0.15.8-ed8aab",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-eec4ba",
  "org.scalablytyped" %%% "injection-js" % "2.4.0-06bdff",
  "org.scalablytyped" %%% "magic-string" % "0.26.4-0cfc9f",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-84ae38",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "rollup" % "2.79.1-091416",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20220811Z-8f7d96",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "typescript" % "4.8.4-6579b4")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
