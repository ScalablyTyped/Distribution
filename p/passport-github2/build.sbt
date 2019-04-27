organization := "org.scalablytyped"
name := "passport-github2"
version := "1.2-dt-20190305Z-d4c6ca"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-3d760a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-b0fe56",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-e7b69f",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190423Z-a7e7ca",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-b7b3da",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190426Z-d35e72",
  "org.scalablytyped" %%% "oauth" % "0.9-dt-20181015Z-0827ce",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20181215Z-b30a1f",
  "org.scalablytyped" %%% "passport-oauth2" % "1.4-dt-20181204Z-54d1db",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-c3b9c7",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-1ae06d",
  "org.scalablytyped" %%% "std" % "3.4-6f75bc")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        