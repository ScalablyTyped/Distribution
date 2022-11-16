organization := "org.scalablytyped"
name := "parcel__core"
version := "2.8.0-775174"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-4346d8",
  "org.scalablytyped" %%% "parcel__diagnostic" % "2.8.0-1acde7",
  "org.scalablytyped" %%% "parcel__package-manager" % "2.8.0-c217e7",
  "org.scalablytyped" %%% "parcel__source-map" % "2.1.1-07d492",
  "org.scalablytyped" %%% "parcel__types" % "2.8.0-8959e9",
  "org.scalablytyped" %%% "parcel__workers" % "2.8.0-0782db",
  "org.scalablytyped" %%% "std" % "4.9-c133ce")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
