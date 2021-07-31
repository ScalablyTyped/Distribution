organization := "org.scalablytyped"
name := "naver-whale"
version := "0.0-unknown-dt-20201002Z-880f91"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "chrome" % "0.0-unknown-dt-20201028Z-5a96e8",
  "org.scalablytyped" %%% "filesystem" % "0.0-unknown-dt-20201002Z-eba870",
  "org.scalablytyped" %%% "filewriter" % "0.0-unknown-dt-20201002Z-ccfe6c",
  "org.scalablytyped" %%% "har-format" % "1.2-dt-20201030Z-1745e2",
  "org.scalablytyped" %%% "std" % "4.1-044efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
