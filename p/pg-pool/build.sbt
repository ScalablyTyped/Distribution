organization := "org.scalablytyped"
name := "pg-pool"
version := "2.0-dt-20211202Z-efa0c2"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "node" % "18.11-dt-20221026Z-107efe",
  "org.scalablytyped" %%% "pg" % "8.6-dt-20220307Z-d4808c",
  "org.scalablytyped" %%% "pg-protocol" % "1.5.0-4b9f85",
  "org.scalablytyped" %%% "pg-types" % "4.0.0-ee5af1",
  "org.scalablytyped" %%% "std" % "4.8-837c43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
