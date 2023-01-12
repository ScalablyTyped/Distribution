organization := "org.scalablytyped"
name := "parcel__types"
version := "2.8.0-c0e125"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "parcel__diagnostic" % "2.8.0-38e377",
  "org.scalablytyped" %%% "parcel__package-manager" % "2.8.0-e28690",
  "org.scalablytyped" %%% "parcel__source-map" % "2.1.1-164585",
  "org.scalablytyped" %%% "parcel__workers" % "2.8.0-b31e2f",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
