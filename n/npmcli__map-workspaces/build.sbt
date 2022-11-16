organization := "org.scalablytyped"
name := "npmcli__map-workspaces"
version := "3.0-dt-20221024Z-b46868"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-005ba9",
  "org.scalablytyped" %%% "glob" % "8.0-dt-20220830Z-d5113e",
  "org.scalablytyped" %%% "minimatch" % "5.1-dt-20220831Z-7e6dc6",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "node-fetch" % "3.3.0-520780",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-92634e",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-560763",
  "org.scalablytyped" %%% "npmcli__arborist" % "5.6-dt-20221020Z-e452ea",
  "org.scalablytyped" %%% "npmcli__package-json" % "2.0-dt-20220510Z-3669ac",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-345552",
  "org.scalablytyped" %%% "pacote" % "11.1-dt-20220616Z-b02056",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-a895b3",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
