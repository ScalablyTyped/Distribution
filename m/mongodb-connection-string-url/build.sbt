organization := "org.scalablytyped"
name := "mongodb-connection-string-url"
version := "2.6.0-f3e650"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "webidl-conversions" % "7.0-dt-20220829Z-7c1ad0",
  "org.scalablytyped" %%% "whatwg-url" % "11.0-dt-20230328Z-02f23b")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
