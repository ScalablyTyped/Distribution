organization := "org.scalablytyped"
name := "ng-packagr"
version := "14.2.1-813869"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.10-9da090",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.7-10ac45",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-67f56e",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-955503",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-5b3929",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-5fc152",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-0ceec3",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-10b9d5",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b27c06",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-0db274",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-35413f",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-0de974",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-edf6e0",
  "org.scalablytyped" %%% "esbuild" % "0.15.12-e86294",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-60c960",
  "org.scalablytyped" %%% "injection-js" % "2.4.0-507511",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-dba250",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-033b8a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "rollup" % "3.3.0-76f060",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-d48537",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20221026Z-7e28ad",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb",
  "org.scalablytyped" %%% "typescript" % "4.9.3-94f598")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
