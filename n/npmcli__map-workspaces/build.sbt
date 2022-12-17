organization := "org.scalablytyped"
name := "npmcli__map-workspaces"
version := "3.0-dt-20221024Z-b2ef8b"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-8b3bb1",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-8678ad",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-b63e37",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "node-fetch" % "3.3.0-2d1740",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-92634e",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-e1eccd",
  "org.scalablytyped" %%% "npmcli__arborist" % "5.6-dt-20221020Z-3612d8",
  "org.scalablytyped" %%% "npmcli__package-json" % "2.0-dt-20220510Z-6cd33a",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-2e7867",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-28c591",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-a8775f",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
