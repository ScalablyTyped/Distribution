organization := "org.scalablytyped"
name := "parcel__core"
version := "2.7.0-2f5838"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221018Z-1e532a",
  "org.scalablytyped" %%% "parcel__diagnostic" % "2.7.0-e85c23",
  "org.scalablytyped" %%% "parcel__package-manager" % "2.7.0-6235dd",
  "org.scalablytyped" %%% "parcel__source-map" % "2.1.1-175a64",
  "org.scalablytyped" %%% "parcel__types" % "2.7.0-77e192",
  "org.scalablytyped" %%% "parcel__workers" % "2.7.0-26c375",
  "org.scalablytyped" %%% "std" % "4.8-3c7765")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
