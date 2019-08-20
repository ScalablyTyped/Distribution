organization := "org.scalablytyped"
name := "nodemailer-ses-transport"
version := "3.1-dt-20190717Z-0b1033"
scalaVersion := "2.12.9"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk" % "2.513.0-4c9cd5",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190815Z-2dc4df",
  "org.scalablytyped" %%% "nodemailer" % "6.2-dt-20190722Z-d9f643",
  "org.scalablytyped" %%% "std" % "3.5-cd493c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        