organization := "org.scalablytyped"
name := "nes"
version := "7.0.0-dt-20220818Z-226ecc"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "boom" % "7.3-dt-20221103Z-118a62",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20211202Z-7cf14c",
  "org.scalablytyped" %%% "hapi" % "18.0-dt-20221103Z-183fcc",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20211202Z-a0c0e9",
  "org.scalablytyped" %%% "joi" % "17.7.0-c612b4",
  "org.scalablytyped" %%% "mime-db" % "1.43-dt-20211202Z-73e469",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20211202Z-910a44",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221101Z-874609",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20211202Z-5143c4",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20211202Z-b1af3c",
  "org.scalablytyped" %%% "std" % "4.9-ecb5eb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
