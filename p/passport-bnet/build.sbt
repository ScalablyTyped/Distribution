organization := "org.scalablytyped"
name := "passport-bnet"
version := "2.0-dt-20181204Z-1bbb8e"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-d1ac4d",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-751003",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-6ba758",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190318Z-92341b",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-2631f3",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190409Z-512fe2",
  "org.scalablytyped" %%% "oauth" % "0.9-dt-20181015Z-03fca1",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20181215Z-440e79",
  "org.scalablytyped" %%% "passport-oauth2" % "1.4-dt-20181204Z-9c0bd9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-623d43",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-84d26d",
  "org.scalablytyped" %%% "std" % "3.4-d52857")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        