organization := "org.scalablytyped"
name := "mongoose-promise"
version := "4.5.4-dt-20180910Z-44a878"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "1.0.0",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "bson" % "1.0.6-dt-20180910Z-e19db4",
  "org.scalablytyped" %%% "mongodb" % "v3.1-dt-20181203Z-47ec07",
  "org.scalablytyped" %%% "mongoose" % "5.3.4-dt-20181213Z-dc0849",
  "org.scalablytyped" %%% "mpromise" % "0.5.4-dt-20180910Z-c15410",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181214Z-702cdc",
  "org.scalablytyped" %%% "std" % "3.2.2-beaa2f")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        