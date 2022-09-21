organization := "org.scalablytyped"
name := "parcel__types"
version := "2.7.0-fb4809"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.7-dt-20220913Z-77cc8d",
  "org.scalablytyped" %%% "parcel__diagnostic" % "2.7.0-d810e0",
  "org.scalablytyped" %%% "parcel__fs" % "2.7.0-c5c230",
  "org.scalablytyped" %%% "parcel__package-manager" % "2.7.0-9f9085",
  "org.scalablytyped" %%% "parcel__source-map" % "2.1.1-51afc7",
  "org.scalablytyped" %%% "parcel__watcher" % "2.0.5-cf3980",
  "org.scalablytyped" %%% "parcel__workers" % "2.7.0-51baed",
  "org.scalablytyped" %%% "std" % "4.8-958c79")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
