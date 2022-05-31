organization := "org.scalablytyped"
name := "pacote"
version := "11.1-dt-20200327Z-ef30cc"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "form-data" % "3.0.0-1ba95a",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-11c649",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20200515Z-07cad7",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20200515Z-20b573",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20200323Z-5df53b",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-8b5d59",
  "org.scalablytyped" %%% "ssri" % "7.1-dt-20200620Z-ff1ec1",
  "org.scalablytyped" %%% "std" % "4.1-f7e8ab")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
