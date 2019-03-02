organization := "org.scalablytyped"
name := "mock-aws-s3"
version := "2.6-dt-20181017Z-707625"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.413.0-d61ba0",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-bfbf8a",
  "org.scalablytyped" %%% "buffer" % "5.2.1-a76575",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-a9efa9",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-deeabc",
  "org.scalablytyped" %%% "node" % "11.10-dt-20190228Z-bb7734",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-d7f378",
  "org.scalablytyped" %%% "std" % "3.3-6e4388",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-c29a23",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-5fe637")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        