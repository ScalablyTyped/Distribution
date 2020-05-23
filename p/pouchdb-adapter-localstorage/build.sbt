organization := "org.scalablytyped"
name := "pouchdb-adapter-localstorage"
version := "6.1-dt-20200515Z-9d53fc"
scalaVersion := "2.13.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "debug" % "4.1-dt-20200226Z-b4ce56",
  "org.scalablytyped" %%% "pouchdb-core" % "7.0-dt-20200519Z-a27af4",
  "org.scalablytyped" %%% "pouchdb-find" % "6.3-dt-20200515Z-f01025",
  "org.scalablytyped" %%% "std" % "3.9-18cbeb")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
