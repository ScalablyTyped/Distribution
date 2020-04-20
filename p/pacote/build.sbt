organization := "org.scalablytyped"
name := "pacote"
version := "11.1-dt-20200327Z-a889fc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "form-data" % "3.0.0-b3cc63",
  "org.scalablytyped" %%% "node" % "13.13-dt-20200417Z-f3d81d",
  "org.scalablytyped" %%% "node-fetch" % "2.5-dt-20200411Z-7330ae",
  "org.scalablytyped" %%% "npm-package-arg" % "6.1-dt-20181031Z-2400e9",
  "org.scalablytyped" %%% "npm-registry-fetch" % "8.0-dt-20200323Z-d7f096",
  "org.scalablytyped" %%% "npmlog" % "4.1-dt-20190626Z-425b94",
  "org.scalablytyped" %%% "ssri" % "6.0-dt-20190422Z-19d575",
  "org.scalablytyped" %%% "std" % "3.8-9b2470")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
