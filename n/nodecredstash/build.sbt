organization := "org.scalablytyped"
name := "nodecredstash"
version := "2.0-dt-20180327Z-e69087"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "aws-sdk" % "2.437.0-01f90d",
  "org.scalablytyped" %%% "events" % "3.0-dt-20190114Z-3a85ce",
  "org.scalablytyped" %%% "jmespath" % "0.15-dt-20180214Z-00ea77",
  "org.scalablytyped" %%% "node" % "11.13-dt-20190408Z-6fa8bf",
  "org.scalablytyped" %%% "sax" % "1.x-dt-20190322Z-12bb56",
  "org.scalablytyped" %%% "std" % "3.4-d52857",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-4ae640",
  "org.scalablytyped" %%% "xml2js" % "0.4-dt-20190402Z-5711d7")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        