organization := "org.scalablytyped"
name := "naver-whale"
version := "0.0-unknown-dt-20220818Z-b1f538"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20221103Z-307970",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20221103Z-1f0476",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20221103Z-5561bf",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20220923Z-208c24",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
