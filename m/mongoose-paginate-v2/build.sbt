organization := "org.scalablytyped"
name := "mongoose-paginate-v2"
version := "1.3-dt-20200226Z-334e76"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bson" % "4.0-dt-20200319Z-8ab6dd",
  "org.scalablytyped" %%% "mongodb" % "3.5-dt-20200305Z-cab691",
  "org.scalablytyped" %%% "mongoose" % "5.7.12-dt-20200320Z-4f8a07",
  "org.scalablytyped" %%% "node" % "13.9-dt-20200318Z-96a265",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
