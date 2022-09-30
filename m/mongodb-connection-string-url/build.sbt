organization := "org.scalablytyped"
name := "mongodb-connection-string-url"
version := "2.5.3-3b00b7"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "webidl-conversions" % "7.0-dt-20220829Z-9db843",
  "org.scalablytyped" %%% "whatwg-url" % "11.0-dt-20220829Z-14dcdf")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
