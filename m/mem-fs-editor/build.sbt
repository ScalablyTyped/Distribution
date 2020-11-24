organization := "org.scalablytyped"
name := "mem-fs-editor"
version := "7.0-dt-20200707Z-100cab"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ejs" % "3.0-dt-20201020Z-5d46b4",
  "org.scalablytyped" %%% "glob" % "7.1-dt-20200706Z-3075c2",
  "org.scalablytyped" %%% "json-schema" % "7.0-dt-20200831Z-13c485",
  "org.scalablytyped" %%% "mem-fs" % "1.1-dt-20181203Z-b93368",
  "org.scalablytyped" %%% "minimatch" % "3.0-dt-20200515Z-bab05f",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-ad1aba",
  "org.scalablytyped" %%% "std" % "4.1-c651d0",
  "org.scalablytyped" %%% "vinyl" % "2.0-dt-20201002Z-c002e2")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
