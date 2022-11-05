organization := "org.scalablytyped"
name := "ng-packagr"
version := "14.2.1-5539d6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.9-c4304c",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.7-33ff2c",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-b3eb08",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-63e35b",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-a9564c",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-412870",
  "org.scalablytyped" %%% "babel__parser" % "7.20.2-663c13",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-3ac905",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b54012",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-5a1686",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-8d7a3d",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-ed3b05",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-efd2dc",
  "org.scalablytyped" %%% "esbuild" % "0.15.12-df719c",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-94b07f",
  "org.scalablytyped" %%% "injection-js" % "2.4.0-41574a",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-deb100",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-19e0f3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "rollup" % "3.2.5-600601",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-6ac0e4",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20221026Z-e709b4",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "typescript" % "4.8.4-60b1be")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
