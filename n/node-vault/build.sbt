organization := "com.scalablytyped"
name := "node-vault"
version := "0.5-dt-20180910Z-ca0dcd"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "com.scalablytyped" %%% "caseless" % "0.12-dt-20180910Z-7ce57e",
  "com.scalablytyped" %%% "events" % "1.2-dt-20180910Z-abe6d1",
  "com.scalablytyped" %%% "form-data" % "2.2-dt-20181120Z-dc466d",
  "com.scalablytyped" %%% "mustache" % "0.8.4-dt-20181027Z-d05d1e",
  "com.scalablytyped" %%% "node" % "10.12-dt-20181121Z-913134",
  "com.scalablytyped" %%% "request" % "2.48-dt-20181105Z-57e002",
  "com.scalablytyped" %%% "std" % "3.1.3-0b55f4",
  "com.scalablytyped" %%% "tough-cookie" % "2.3-dt-20181104Z-a9e24d",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        