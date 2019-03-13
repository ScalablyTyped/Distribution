organization := "org.scalablytyped"
name := "nodecredstash"
version := "2.0-dt-20180327Z-6070f1"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.420.0-9d88c2",
  "org.scalablytyped" %%% "base64-js" % "1.2-dt-20180214Z-645745",
  "org.scalablytyped" %%% "buffer" % "5.2.1-1b2aa5",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-a6b9cb",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-f324c8",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190312Z-f6d9fe",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-2b22ac",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-a1581b",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-0210f1")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        