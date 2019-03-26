organization := "org.scalablytyped"
name := "pascal-case"
version := "2.0.1-ca0985"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "camel-case" % "3.0.0-3e9ce5",
  "org.scalablytyped" %%% "lower-case" % "1.1.4-d7e181",
  "org.scalablytyped" %%% "no-case" % "2.3.2-c732b8",
  "org.scalablytyped" %%% "std" % "3.3-14e863",
  "org.scalablytyped" %%% "upper-case" % "1.1.3-db1c64",
  "org.scalablytyped" %%% "upper-case-first" % "1.1.2-6a1068")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        