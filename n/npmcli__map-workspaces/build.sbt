organization := "org.scalablytyped"
name := "npmcli__map-workspaces"
version := "3.0-dt-20230412Z-ec8b01"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-534907",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "node-fetch" % "3.3.1-0dca8e",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-edb2bc",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-a8a5a6",
  "org.scalablytyped" %%% "npmcli__arborist" % "5.6-dt-20230113Z-94da67",
  "org.scalablytyped" %%% "npmcli__package-json" % "2.0-dt-20220510Z-e880de",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-812e7c",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-e4b50d",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-8aea55",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
