organization := "org.scalablytyped"
name := "npm-profile"
version := "5.0-dt-20200908Z-ccbae8"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "form-data" % "3.0.0-1b5b63",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-814aa8",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20200515Z-9e6fa8",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20200515Z-c4c443",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20200323Z-e7a0ba",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-ca1059",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20200620Z-4c1a6c",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
