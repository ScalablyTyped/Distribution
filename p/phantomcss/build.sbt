organization := "org.scalablytyped"
name := "phantomcss"
version := "0.11.1-dt-20220818Z-68f786"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "casperjs" % "1.1-dt-20211202Z-aabe42",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "phantomjs" % "1.9-dt-20211223Z-ccd325",
  "org.scalablytyped" %%% "resemblejs" % "v4.1.0-dt-20220818Z-ebe244",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
