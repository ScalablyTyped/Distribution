organization := "org.scalablytyped"
name := "popoto"
version := "3.0-dt-20211202Z-53df02"
scalaVersion := "3.2.0"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.4.2",
  "org.scalablytyped" %%% "d3" % "7.4-dt-20221103Z-c88a04",
  "org.scalablytyped" %%% "d3-array" % "3.0-dt-20220624Z-151901",
  "org.scalablytyped" %%% "d3-axis" % "3.0-dt-20220624Z-9dd04a",
  "org.scalablytyped" %%% "d3-brush" % "3.0-dt-20211202Z-b78d3f",
  "org.scalablytyped" %%% "d3-chord" % "3.0-dt-20211202Z-818205",
  "org.scalablytyped" %%% "d3-color" % "3.1-dt-20220522Z-4a0944",
  "org.scalablytyped" %%% "d3-contour" % "3.0-dt-20211202Z-5a8e12",
  "org.scalablytyped" %%% "d3-delaunay" % "6.0-dt-20220524Z-7e8b37",
  "org.scalablytyped" %%% "d3-dispatch" % "3.0-dt-20220624Z-e19b82",
  "org.scalablytyped" %%% "d3-drag" % "3.0-dt-20211202Z-c410e9",
  "org.scalablytyped" %%% "d3-dsv" % "3.0-dt-20220819Z-52d79a",
  "org.scalablytyped" %%% "d3-ease" % "3.0-dt-20211223Z-5975ea",
  "org.scalablytyped" %%% "d3-fetch" % "3.0-dt-20220624Z-47baa0",
  "org.scalablytyped" %%% "d3-force" % "3.0-dt-20211202Z-cec9fe",
  "org.scalablytyped" %%% "d3-format" % "3.0-dt-20211202Z-3b877b",
  "org.scalablytyped" %%% "d3-geo" % "3.0-dt-20211202Z-ff20a9",
  "org.scalablytyped" %%% "d3-hierarchy" % "3.1-dt-20220624Z-224e97",
  "org.scalablytyped" %%% "d3-interpolate" % "3.0-dt-20220624Z-d85eca",
  "org.scalablytyped" %%% "d3-path" % "3.0-dt-20220310Z-d2c2a8",
  "org.scalablytyped" %%% "d3-quadtree" % "3.0-dt-20220624Z-413875",
  "org.scalablytyped" %%% "d3-random" % "3.0-dt-20211202Z-de8bf6",
  "org.scalablytyped" %%% "d3-scale" % "4.0-dt-20220624Z-dc6480",
  "org.scalablytyped" %%% "d3-selection" % "3.0-dt-20220720Z-e38452",
  "org.scalablytyped" %%% "d3-shape" % "3.1-dt-20220624Z-29f529",
  "org.scalablytyped" %%% "d3-time" % "3.0-dt-20211202Z-afd487",
  "org.scalablytyped" %%% "d3-time-format" % "4.0-dt-20211202Z-5dfa68",
  "org.scalablytyped" %%% "d3-timer" % "3.0-dt-20211202Z-14b69b",
  "org.scalablytyped" %%% "d3-transition" % "3.0-dt-20220817Z-576765",
  "org.scalablytyped" %%% "d3-zoom" % "3.0-dt-20220624Z-3d878e",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20220713Z-93246d",
  "org.scalablytyped" %%% "std" % "4.8-686d1d")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-feature", "-language:implicitConversions", "-language:higherKinds", "-language:existentials", "-no-indent", "-source:future")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
