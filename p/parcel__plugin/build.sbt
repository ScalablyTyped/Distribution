organization := "org.scalablytyped"
name := "parcel__plugin"
version := "2.8.0-f1698a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-def929",
  "org.scalablytyped" %%% "parcel__diagnostic" % "2.8.0-ec4504",
  "org.scalablytyped" %%% "parcel__package-manager" % "2.8.0-6bc7e1",
  "org.scalablytyped" %%% "parcel__source-map" % "2.1.1-c143a5",
  "org.scalablytyped" %%% "parcel__types" % "2.8.0-9c4a9d",
  "org.scalablytyped" %%% "parcel__workers" % "2.8.0-fa733d",
  "org.scalablytyped" %%% "std" % "4.9-5f989f")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
