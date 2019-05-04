organization := "org.scalablytyped"
name := "node-sass-middleware"
version := "0.0-unknown-dt-20190322Z-ace12d"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.0.0",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180425Z-56ad56",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20190322Z-a597fb",
  "org.scalablytyped" %%% "express" % "4.16-dt-20190122Z-5ac7c3",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20190429Z-99402a",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20190205Z-169399",
  "org.scalablytyped" %%% "node" % "12.0-dt-20190503Z-6753fb",
  "org.scalablytyped" %%% "node-sass" % "4.11-dt-20190213Z-5b59dc",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-acf35f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20190322Z-94d189",
  "org.scalablytyped" %%% "std" % "3.4-8a92b2")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        