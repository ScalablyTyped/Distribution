organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20220818Z-53e241"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20221107Z-18807e",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20211223Z-b30ed9",
  "org.scalablytyped" %%% "resemblejs" % "v4.1.0-dt-20221103Z-c85499",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
