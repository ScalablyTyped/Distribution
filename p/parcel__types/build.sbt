organization := "org.scalablytyped"
name := "parcel__types"
version := "2.7.0-1fa32a"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220926Z-d201ab",
  "org.scalablytyped" %%% "parcel__diagnostic" % "2.7.0-900433",
  "org.scalablytyped" %%% "parcel__fs" % "2.7.0-7a0e74",
  "org.scalablytyped" %%% "parcel__package-manager" % "2.7.0-edffcd",
  "org.scalablytyped" %%% "parcel__source-map" % "2.1.1-c247b5",
  "org.scalablytyped" %%% "parcel__watcher" % "2.0.5-095900",
  "org.scalablytyped" %%% "parcel__workers" % "2.7.0-7acc36",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
