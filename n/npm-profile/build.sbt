organization := "org.scalablytyped"
name := "npm-profile"
version := "5.0-dt-20220802Z-5fbd21"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-005ba9",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "node-fetch" % "3.3.0-520780",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-92634e",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-560763",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-345552",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-a895b3",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
