organization := "com.scalablytyped"
name := "nodecredstash"
version := "2.0-dt-20180910Z-58ef75"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "aws-sdk" % "2.339.0-cd63d8",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "jmespath" % "0.15-dt-20180910Z-5b1796",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "sax" % "1.x-dt-20180910Z-870ec2",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "uuid" % "3.4-dt-20180910Z-f0a282",
  "com.scalablytyped" %%% "xml2js" % "0.4-dt-20180910Z-1681c6",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        