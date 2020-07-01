organization := "org.scalablytyped"
name := "pouchdb-browser"
version := "6.1-dt-20200226Z-02602d"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-70bc6c",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20200519Z-0fb72a",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20200515Z-624f36",
  "org.scalablytyped" %%% "std" % "3.9-c9f1f8")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
