organization := "org.scalablytyped"
name := "parcel__cache"
version := "2.8.0-0f1489"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-86f548",
  "org.scalablytyped" %%% "parcel__diagnostic" % "2.8.0-8b0138",
  "org.scalablytyped" %%% "parcel__package-manager" % "2.8.0-1d92c3",
  "org.scalablytyped" %%% "parcel__source-map" % "2.1.1-3e2256",
  "org.scalablytyped" %%% "parcel__types" % "2.8.0-5bf54c",
  "org.scalablytyped" %%% "parcel__workers" % "2.8.0-8b21c5",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
