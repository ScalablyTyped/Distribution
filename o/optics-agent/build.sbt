organization := "org.scalablytyped"
name := "optics-agent"
version := "1.1-dt-20181027Z-666ed4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180910Z-db9c57",
  "org.scalablytyped" %%% "body-parser" % "1.17-dt-20180910Z-5f074c",
  "org.scalablytyped" %%% "boom" % "7.2-dt-20181120Z-f1f267",
  "org.scalablytyped" %%% "catbox" % "10.0-dt-20181121Z-8d834a",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20180910Z-95bd8f",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20180910Z-ef0760",
  "org.scalablytyped" %%% "express" % "4.16-dt-20180910Z-c7573b",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.16-dt-20180910Z-702174",
  "org.scalablytyped" %%% "graphql" % "14.0-dt-20181018Z-505dae",
  "org.scalablytyped" %%% "hapi" % "17.8-dt-20181129Z-0ec501",
  "org.scalablytyped" %%% "http-assert" % "1.3-dt-20181121Z-ae5f42",
  "org.scalablytyped" %%% "iron" % "5.0-dt-20180910Z-3e7898",
  "org.scalablytyped" %%% "joi" % "14.0-dt-20181031Z-9abdd3",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20180910Z-9bb5e0",
  "org.scalablytyped" %%% "koa" % "2.x-dt-20181120Z-3c3b26",
  "org.scalablytyped" %%% "koa-compose" % "3.2-dt-20180910Z-42698d",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20180910Z-60e32c",
  "org.scalablytyped" %%% "mime-db" % "1.27-dt-20180910Z-fca61e",
  "org.scalablytyped" %%% "mimos" % "3.0-dt-20180910Z-2ab15c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181203Z-646a31",
  "org.scalablytyped" %%% "podium" % "1.0-dt-20180910Z-e52d61",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181208Z-7e710f",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20180910Z-35654c",
  "org.scalablytyped" %%% "shot" % "4.0-dt-20181002Z-752ee2",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        