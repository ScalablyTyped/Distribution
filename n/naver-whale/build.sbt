organization := "org.scalablytyped"
name := "naver-whale"
version := "0.0-unknown-dt-20220818Z-00911b"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20220916Z-990df7",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20220818Z-65d058",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20220818Z-fd6dbd",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20220923Z-a2191f",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
