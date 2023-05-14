organization := "org.scalablytyped"
name := "meteor-prime8consulting-oauth2"
version := "0.0-unknown-dt-20221103Z-b65b7a"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "bson" % "5.3.0-6510cf",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20220818Z-877ec7",
  "org.scalablytyped" %%% "csstype" % "3.1.2-5927f3",
  "org.scalablytyped" %%% "jquery" % "3.5-dt-20221231Z-60047c",
  "org.scalablytyped" %%% "meteor" % "2.9-dt-20230414Z-4cce15",
  "org.scalablytyped" %%% "mongodb" % "5.5.0-37ffa7",
  "org.scalablytyped" %%% "node" % "20.1-dt-20230513Z-b25634",
  "org.scalablytyped" %%% "nodemailer" % "6.4-dt-20230130Z-ed2f0d",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20220407Z-4446ee",
  "org.scalablytyped" %%% "react" % "18.2-dt-20230506Z-14ab9d",
  "org.scalablytyped" %%% "scheduler" % "0.16-dt-20230322Z-da1b40",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20211202Z-227892",
  "org.scalablytyped" %%% "std" % "5.0-e63739",
  "org.scalablytyped" %%% "underscore" % "1.11-dt-20221230Z-78d9c7")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
