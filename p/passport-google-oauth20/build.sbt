organization := "org.scalablytyped"
name := "passport-google-oauth20"
version := "2.0-dt-20190710Z-b21b36"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20190819Z-0f462b",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-8e708a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20190819Z-381ce5",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190819Z-aba9aa",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-c877f7",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "oauth" % "0.9-dt-20181015Z-2ec9c9",
  "org.scalablytyped" %%% "passport" % "1.0-dt-20190717Z-93d4d6",
  "org.scalablytyped" %%% "passport-oauth2" % "1.4-dt-20181204Z-4c8684",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-b87c0a",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190819Z-c4d375",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        