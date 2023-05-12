organization := "org.scalablytyped"
name := "parcel__core"
version := "2.8.3-7320df"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230511Z-0320fc",
  "org.scalablytyped" %%% "parcel__diagnostic" % "2.8.3-275970",
  "org.scalablytyped" %%% "parcel__package-manager" % "2.8.3-e9a71e",
  "org.scalablytyped" %%% "parcel__source-map" % "2.1.1-92665b",
  "org.scalablytyped" %%% "parcel__types" % "2.8.3-d2fe03",
  "org.scalablytyped" %%% "parcel__workers" % "2.8.3-3867ff",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
