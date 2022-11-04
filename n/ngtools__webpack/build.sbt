organization := "org.scalablytyped"
name := "ngtools__webpack"
version := "14.2.6-096ea6"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.0-6482f2",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.9-c4304c",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.7-581d84",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20220624Z-b67249",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-bf895e",
  "org.scalablytyped" %%% "babel__parser" % "7.20.1-1ab1d1",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-114ca7",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-aa17f1",
  "org.scalablytyped" %%% "babel__types" % "7.20.0-d18d74",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-ed3b05",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-efd2dc",
  "org.scalablytyped" %%% "estree" % "1.0-dt-20220712Z-6f817a",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20220325Z-349280",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-deb100",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "re2" % "1.17.7-a226e5",
  "org.scalablytyped" %%% "schema-utils" % "4.0.0-3da904",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20221026Z-e709b4",
  "org.scalablytyped" %%% "std" % "4.8-837c43",
  "org.scalablytyped" %%% "tapable" % "2.2.1-52b605",
  "org.scalablytyped" %%% "typescript" % "4.8.4-60b1be",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-37b092",
  "org.scalablytyped" %%% "webpack" % "5.74.0-3f97e9")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
