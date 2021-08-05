organization := "org.scalablytyped"
name := "pacote"
version := "11.1-dt-20200327Z-b4f7d3"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "form-data" % "3.0.0-109ff3",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20200515Z-9dfb6e",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20200515Z-20b573",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20200323Z-9473ba",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-8c8d29",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20200620Z-7b7c24",
  "org.scalablytyped" %%% "std" % "4.1-2f6855")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
