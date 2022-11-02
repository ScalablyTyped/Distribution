organization := "org.scalablytyped"
name := "npmcli__map-workspaces"
version := "3.0-dt-20221024Z-d23b16"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-385072",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-94b07f",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-19e0f3",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-d0f137",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-9bbd2c",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-262b19",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-42284f",
  "org.scalablytyped" %%% "npmcli__arborist" % "5.6-dt-20221020Z-156623",
  "org.scalablytyped" %%% "npmcli__package-json" % "2.0-dt-20220510Z-b03b89",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-b5a594",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-febdd1",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-094865",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
