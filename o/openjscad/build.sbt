organization := "org.scalablytyped"
name := "openjscad"
version := "0.0-unknown-dt-20220818Z-02e94e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb",
  "org.scalablytyped" %%% "three" % "0.144-dt-20220902Z-a52a93",
  "org.scalablytyped" %%% "webxr" % "0.5-dt-20220721Z-c71d19")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
