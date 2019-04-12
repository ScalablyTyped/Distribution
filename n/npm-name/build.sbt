organization := "org.scalablytyped"
name := "npm-name"
version := "5.3.0-4fedf0"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "got" % "9.4-dt-20190312Z-8e7a08",
  "org.scalablytyped" %%% "is-scoped" % "2.1.0-9699f0",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20190402Z-69a948",
  "org.scalablytyped" %%% "lodash_dot_zip" % "4.2-dt-20190214Z-e42fa8",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "registry-auth-token" % "3.3-dt-20180723Z-38b89f",
  "org.scalablytyped" %%% "scoped-regex" % "2.1.0-50aaae",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-972cef")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        