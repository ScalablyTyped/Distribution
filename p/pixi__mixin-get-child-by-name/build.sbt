organization := "org.scalablytyped"
name := "pixi__mixin-get-child-by-name"
version := "6.5.4-a776a2"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "eventemitter3" % "4.0.7-b75196",
  "org.scalablytyped" %%% "offscreencanvas" % "2019.7-dt-20220526Z-fdde97",
  "org.scalablytyped" %%% "pixi__constants" % "6.5.4-227c68",
  "org.scalablytyped" %%% "pixi__core" % "6.5.4-45a842",
  "org.scalablytyped" %%% "pixi__display" % "6.5.4-155207",
  "org.scalablytyped" %%% "pixi__extensions" % "6.5.4-2be343",
  "org.scalablytyped" %%% "pixi__math" % "6.5.4-097ee9",
  "org.scalablytyped" %%% "pixi__runner" % "6.5.4-5c4727",
  "org.scalablytyped" %%% "pixi__settings" % "6.5.4-dd004c",
  "org.scalablytyped" %%% "pixi__utils" % "6.5.4-4b97cd",
  "org.scalablytyped" %%% "std" % "4.8-9f8efb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
