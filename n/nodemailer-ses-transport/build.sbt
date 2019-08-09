organization := "org.scalablytyped"
name := "nodemailer-ses-transport"
version := "3.1-dt-20190717Z-809d54"
scalaVersion := "2.12.8"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "aws-sdk" % "2.506.0-133ef9",
  "org.scalablytyped" %%% "node" % "12.7-dt-20190807Z-ed4b3f",
  "org.scalablytyped" %%% "nodemailer" % "6.2-dt-20190722Z-50639c",
  "org.scalablytyped" %%% "std" % "3.5-65dbfc")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
        