organization := "org.scalablytyped"
name := "npmcli__map-workspaces"
version := "3.0-dt-20221024Z-957dee"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-6ffa19",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-60c960",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-033b8a",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "node-fetch" % "3.3.0-2d4a26",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-edb2bc",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-fca69b",
  "org.scalablytyped" %%% "npmcli__arborist" % "5.6-dt-20221020Z-ae30e4",
  "org.scalablytyped" %%% "npmcli__package-json" % "2.0-dt-20220510Z-4888a7",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-226472",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-b3e090",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-120378",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
