organization := "org.scalablytyped"
name := "ng-packagr"
version := "14.2.1-69be7a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.7-4f45f7",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.2-aafa6f",
  "org.scalablytyped" %%% "ansi-colors" % "4.1.3-8e5ba0",
  "org.scalablytyped" %%% "anymatch" % "3.1.2-408111",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-317949",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-27b6b7",
  "org.scalablytyped" %%% "babel__parser" % "7.19.6-e8951f",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-f33532",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-0e2ba7",
  "org.scalablytyped" %%% "babel__types" % "7.19.4-1978dd",
  "org.scalablytyped" %%% "chokidar" % "3.5.3-c8be53",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-1bfc7c",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-d90de9",
  "org.scalablytyped" %%% "esbuild" % "0.15.8-b529d0",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-3cb2e2",
  "org.scalablytyped" %%% "injection-js" % "2.4.0-fa2d75",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-bd69f8",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-374fcc",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "rollup" % "3.2.3-eed8d7",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-22ee0d",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20220811Z-4e87db",
  "org.scalablytyped" %%% "std" % "4.8-3c7765",
  "org.scalablytyped" %%% "typescript" % "4.8.4-676e37")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
