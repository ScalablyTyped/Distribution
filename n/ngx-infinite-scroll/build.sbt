organization := "org.scalablytyped"
name := "ngx-infinite-scroll"
version := "14.0.1-cb9bf1"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "ajv" % "8.11.2-96c572",
  "org.scalablytyped" %%% "angular-devkit__core" % "14.2.6-5a1f46",
  "org.scalablytyped" %%% "angular-devkit__schematics" % "14.2.6-9bdc0d",
  "org.scalablytyped" %%% "angular__compiler" % "14.2.10-63fd49",
  "org.scalablytyped" %%% "angular__compiler-cli" % "14.2.7-898c60",
  "org.scalablytyped" %%% "angular__core" % "14.2.10-e344e1",
  "org.scalablytyped" %%% "babel__core" % "7.1-dt-20221107Z-5ca42e",
  "org.scalablytyped" %%% "babel__generator" % "7.6-dt-20211223Z-82c4da",
  "org.scalablytyped" %%% "babel__parser" % "7.20.3-5a73bf",
  "org.scalablytyped" %%% "babel__template" % "7.4-dt-20211202Z-5dfb0f",
  "org.scalablytyped" %%% "babel__traverse" % "7.18-dt-20220923Z-5100e9",
  "org.scalablytyped" %%% "babel__types" % "7.20.2-b582b5",
  "org.scalablytyped" %%% "convert-source-map" % "1.5-dt-20211202Z-1b4a23",
  "org.scalablytyped" %%% "dependency-graph" % "0.11.0-ac716a",
  "org.scalablytyped" %%% "jsonc-parser" % "3.2.0-a85b24",
  "org.scalablytyped" %%% "magic-string" % "0.26.7-57a310",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "re2" % "1.17.7-41dbc1",
  "org.scalablytyped" %%% "rxjs" % "7.5.7-fec6f6",
  "org.scalablytyped" %%% "semver" % "7.3-dt-20221026Z-e6b44c",
  "org.scalablytyped" %%% "source-map" % "0.7.4-14f7e0",
  "org.scalablytyped" %%% "std" % "4.9-5f989f",
  "org.scalablytyped" %%% "typescript" % "4.9.3-52822d",
  "org.scalablytyped" %%% "uri-js" % "4.4.1-4bb631")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
