organization := "org.scalablytyped"
name := "ng-packagr"
version := "14.2.1-c2299b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.3-93f2db",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.2-65ac56",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-026783",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-0b1008",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-19cf66",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-558232",
  "org.scalablytyped" %%% "babel__parser" % "7.19.1-0f60fc",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-9d5df8",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220829Z-db75bf",
  "org.scalablytyped" %%% "babel__types" % "7.19.0-70b8c8",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-6ca4bc",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-8fc22a",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-98df15",
  "org.scalablytyped" %%% "esbuild" % "0.15.8-0116c4",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-c57dc0",
  "org.scalablytyped" %%% "injection-js" % "2.4.0-bbc7a2",
  "org.scalablytyped" %%% "magic-string" % "0.26.3-bbf904",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-a8ea5b",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "rollup" % "2.79.0-aeffd0",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20220811Z-e2cc8b",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "typescript" % "4.8.3-775b25")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
