organization := "org.scalablytyped"
name := "mongodb-connection-string-url"
version := "2.5.4-333d1c"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-686d1d",
  "org.scalablytyped" %%% "webidl-conversions" % "7.0-dt-20220829Z-6e75e5",
  "org.scalablytyped" %%% "whatwg-url" % "11.0-dt-20220829Z-7f6a43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
