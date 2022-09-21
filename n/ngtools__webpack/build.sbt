organization := "org.scalablytyped"
name := "ngtools__webpack"
version := "14.2.3-40e74c"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-025d79",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.3-93f2db",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.2-65ac56",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-19cf66",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-558232",
  "org.scalablytyped" %%% "babel__parser" % "7.19.1-0f60fc",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-9d5df8",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220829Z-db75bf",
  "org.scalablytyped" %%% "babel__types" % "7.19.0-70b8c8",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-8fc22a",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-98df15",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-bee5c7",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-aaec85",
  "org.scalablytyped" %%% "magic-string" % "0.26.3-bbf904",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "re2" % "1.17.7-22ea4f",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-ca6ee9",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20220811Z-e2cc8b",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "tapable" % "2.2.1-b2feca",
  "org.scalablytyped" %%% "typescript" % "4.8.3-775b25",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-33748e",
  "org.scalablytyped" %%% "webpack" % "5.74.0-8b6e44")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
