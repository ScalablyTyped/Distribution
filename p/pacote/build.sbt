organization := "org.scalablytyped"
name := "pacote"
version := "11.1-dt-20220616Z-997457"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "formdata-polyfill" % "4.0.10-0c5722",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221020Z-d73de4",
  "org.scalablytyped" %%% "node-fetch" % "3.2.10-9450e8",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20211202Z-c872f9",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20220214Z-7363ab",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20211223Z-2923c2",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20211202Z-8991bd",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
