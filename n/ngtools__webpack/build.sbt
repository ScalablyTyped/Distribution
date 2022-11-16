organization := "org.scalablytyped"
name := "ngtools__webpack"
version := "14.2.6-ff2072"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-3b5adf",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.10-0d3c41",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.7-5452a5",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-61b7b8",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-42cbbf",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-c798fc",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-3669d2",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-b1d659",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-8b54ca",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-192e06",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-e152f4",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-9e7169",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-fdd79d",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-240be7",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "re2" % "1.17.7-7b689a",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-dd595f",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20221026Z-8bcab9",
  "org.scalablytyped" %%% "std" % "4.9-c133ce",
  "org.scalablytyped" %%% "tapable" % "2.2.1-ad9de2",
  "org.scalablytyped" %%% "typescript" % "4.9.3-1dab2c",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-9ebd39",
  "org.scalablytyped" %%% "webpack" % "5.75.0-1b9e73")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
