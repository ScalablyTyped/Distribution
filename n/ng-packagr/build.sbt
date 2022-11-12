organization := "org.scalablytyped"
name := "ng-packagr"
version := "14.2.1-209ca8"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.10-5bb2ee",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.7-b2c607",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-1bec1a",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-b8a828",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-0a8cda",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-aeb792",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-97fb28",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-0c7c84",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-7d45e9",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-2e222a",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-219e25",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-42912f",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-a01018",
  "org.scalablytyped" %%% "esbuild" % "0.15.12-e7323d",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-dbe92e",
  "org.scalablytyped" %%% "injection-js" % "2.4.0-a09952",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-1fe3cb",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-25b5f6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "rollup" % "3.3.0-ebfd9f",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-9dc6db",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20221026Z-2fecb8",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "typescript" % "4.8.4-227bad")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
