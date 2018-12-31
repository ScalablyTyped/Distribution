organization := "org.scalablytyped"
name := "nodemailer-ses-transport"
version := "3.1-dt-20180214Z-f381f4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.382.0-734b79",
  "org.scalablytyped" %%% "events" % "1.2-dt-20180226Z-794124",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-bbea6c",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181219Z-77ce7e",
  "org.scalablytyped" %%% "nodemailer" % "4.6-dt-20180913Z-fec363",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20180616Z-dc40c5",
  "org.scalablytyped" %%% "std" % "3.2.2-9ed5ff",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-34dde2",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20180606Z-710734")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        