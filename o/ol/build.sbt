organization := "org.scalablytyped"
name := "ol"
version := "6.5-dt-20211202Z-73243e"
scalaVersion := "3.1.2"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "arcgis-rest-api" % "10.4-dt-20211202Z-0d909e",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-5d61ed",
  "org.scalablytyped" %%% "rbush" % "3.0-dt-20220819Z-551f31",
  "org.scalablytyped" %%% "std" % "4.8-958c79",
  "org.scalablytyped" %%% "topojson-specification" % "1.0-dt-20220624Z-f99e76")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
