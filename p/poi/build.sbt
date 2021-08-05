organization := "org.scalablytyped"
name := "poi"
version := "12.5-dt-20190414Z-cfcb96"
scalaVersion := "3.0.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-1ee684",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20201002Z-a4b6e2",
  "org.scalablytyped" %%% "connect-history-api-fallback" % "1.3-dt-20200515Z-0ed49a",
  "org.scalablytyped" %%% "express" % "4.17-dt-20201111Z-fb786d",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200921Z-4e2465",
  "org.scalablytyped" %%% "html-minifier-terser" % "5.1-dt-20200923Z-66de25",
  "org.scalablytyped" %%% "html-webpack-plugin" % "4.5.0-799bc2",
  "org.scalablytyped" %%% "http-proxy" % "1.17-dt-20200320Z-66b09b",
  "org.scalablytyped" %%% "http-proxy-middleware" % "0.19-dt-20200515Z-290043",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20200722Z-418907",
  "org.scalablytyped" %%% "node" % "14.14-dt-20201119Z-e00132",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20201002Z-805ca8",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20201002Z-e007a0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20201117Z-22aab1",
  "org.scalablytyped" %%% "std" % "4.1-2f6855",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20201002Z-fbe5c2",
  "org.scalablytyped" %%% "webpack-chain" % "6.5.1-fbaccb",
  "org.scalablytyped" %%% "webpack-dev-server" % "3.11-dt-20201030Z-8e1991")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
