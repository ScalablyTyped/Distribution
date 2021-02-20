organization := "org.scalablytyped"
name := "mirrorx"
version := "0.2-dt-20200902Z-30cdae"
scalaVersion := "2.13.3"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.0",
  "org.scalablytyped" %%% "csstype" % "2.6.14-b4f267",
  "org.scalablytyped" %%% "history" % "4.7.2-dt-20201002Z-df0d91",
  "org.scalablytyped" %%% "hoist-non-react-statics" % "3.3-dt-20190402Z-d582cd",
  "org.scalablytyped" %%% "prop-types" % "15.7-dt-20200515Z-7dc507",
  "org.scalablytyped" %%% "react" % "17.0-dt-20201121Z-9253ae",
  "org.scalablytyped" %%% "react-redux" % "7.1-dt-20201103Z-7da53e",
  "org.scalablytyped" %%% "react-router" % "5.1-dt-20201002Z-f9c625",
  "org.scalablytyped" %%% "redux" % "4.0.5-09f522",
  "org.scalablytyped" %%% "std" % "4.1-40053c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-g:notailcalls", "-language:implicitConversions", "-language:higherKinds", "-language:existentials")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
