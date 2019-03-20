organization := "org.scalablytyped"
name := "mendixmodelsdk"
version := "4.19.0-1c6ad5"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-768261",
  "org.scalablytyped" %%% "deep-equal" % "1.0-dt-20180214Z-a7edc1",
  "org.scalablytyped" %%% "eventsource" % "1.1-dt-20190114Z-f6c7e1",
  "org.scalablytyped" %%% "form-data" % "2.2-dt-20181119Z-7c4227",
  "org.scalablytyped" %%% "mobx" % "5.9.0-6e211d",
  "org.scalablytyped" %%% "node" % "11.11-dt-20190319Z-4635bc",
  "org.scalablytyped" %%% "request" % "2.48-dt-20190117Z-ed2106",
  "org.scalablytyped" %%% "requestretry" % "1.12-dt-20190212Z-492771",
  "org.scalablytyped" %%% "std" % "3.3-ec2942",
  "org.scalablytyped" %%% "tough-cookie" % "2.3-dt-20190117Z-0cc572",
  "org.scalablytyped" %%% "uuid" % "3.4-dt-20180828Z-9461ae",
  "org.scalablytyped" %%% "wolfy87-eventemitter" % "5.2.6-f4f301")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        