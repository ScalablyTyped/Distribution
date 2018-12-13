organization := "org.scalablytyped"
name := "node-pg-migrate"
version := "3.14.2-e7605e"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20181204Z-93340d",
  "org.scalablytyped" %%% "mkdirp" % "0.5-dt-20180910Z-ca7068",
  "org.scalablytyped" %%% "moment" % "2.23.0-1a181b",
  "org.scalablytyped" %%% "node" % "10.12-dt-20181213Z-bd3349",
  "org.scalablytyped" %%% "pg" % "7.4-dt-20181009Z-b96390",
  "org.scalablytyped" %%% "pg-types" % "1.11-dt-20180910Z-b2c884",
  "org.scalablytyped" %%% "std" % "3.2.2-04ea79",
  "org.scalablytyped" %%% "yargs" % "12.0-dt-20180929Z-5bb344")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        