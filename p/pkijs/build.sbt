organization := "org.scalablytyped"
name := "pkijs"
version := "0.0-unknown-dt-20180910Z-c0fdb4"
scalaVersion := "2.12.7"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "runtime" % "1.0.0-M1",
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.scalablytyped" %%% "asn1js" % "0.0-unknown-dt-20180910Z-48cff0",
  "org.scalablytyped" %%% "pvutils" % "0.0-unknown-dt-20180910Z-a0f8a2",
  "org.scalablytyped" %%% "std" % "3.2.2-edfe2b")
publishArtifact in packageDoc := false
scalacOptions += "-P:scalajs:sjsDefinedByDefault"
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
        