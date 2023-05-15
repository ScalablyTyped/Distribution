organization := "org.scalablytyped"
name := "naver-whale"
version := "0.0-unknown-dt-20221230Z-083132"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20230514Z-0eb2c6",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20221103Z-382710",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20221103Z-03309d",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20221130Z-747b47",
  "org.scalablytyped" %%% "std" % "5.0-e63739")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
