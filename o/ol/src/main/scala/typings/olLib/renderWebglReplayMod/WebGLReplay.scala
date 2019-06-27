package typings
package olLib.renderWebglReplayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLReplay
  extends olLib.renderVectorContextMod.default {
  var indices: js.Array[scala.Double] = js.native
  var indicesBuffer: olLib.webglBufferMod.default = js.native
  var lineStringReplay: olLib.renderWebglLineStringReplayMod.default = js.native
  var maxExtent: olLib.extentMod.Extent = js.native
  var origin: olLib.coordinateMod.Coordinate = js.native
  var startIndices: js.Array[scala.Double] = js.native
  var startIndicesFeature: js.Array[_] = js.native
  var tolerance: scala.Double = js.native
  var vertices: js.Array[scala.Double] = js.native
  var verticesBuffer: olLib.webglBufferMod.default = js.native
  /* protected */ def drawElements(
    gl: stdLib.WebGLRenderingContext,
    context: olLib.webglContextMod.default,
    start: scala.Double,
    end: scala.Double
  ): scala.Unit = js.native
  /* protected */ def drawHitDetectionReplay[T](
    gl: stdLib.WebGLRenderingContext,
    context: olLib.webglContextMod.default,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    featureCallback: js.Function1[/* p0 */ olLib.featureMod.default | olLib.renderFeatureMod.default, T],
    oneByOne: scala.Boolean
  ): T = js.native
  /* protected */ def drawHitDetectionReplay[T](
    gl: stdLib.WebGLRenderingContext,
    context: olLib.webglContextMod.default,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    featureCallback: js.Function1[/* p0 */ olLib.featureMod.default | olLib.renderFeatureMod.default, T],
    oneByOne: scala.Boolean,
    opt_hitExtent: olLib.extentMod.Extent
  ): T = js.native
  /* protected */ def drawHitDetectionReplayAll[T](
    gl: stdLib.WebGLRenderingContext,
    context: olLib.webglContextMod.default,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    featureCallback: js.Function1[/* p0 */ olLib.featureMod.default | olLib.renderFeatureMod.default, T]
  ): T = js.native
  /* protected */ def drawHitDetectionReplayOneByOne[T](
    gl: stdLib.WebGLRenderingContext,
    context: olLib.webglContextMod.default,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    featureCallback: js.Function1[/* p0 */ olLib.featureMod.default | olLib.renderFeatureMod.default, T]
  ): T = js.native
  /* protected */ def drawHitDetectionReplayOneByOne[T](
    gl: stdLib.WebGLRenderingContext,
    context: olLib.webglContextMod.default,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    featureCallback: js.Function1[/* p0 */ olLib.featureMod.default | olLib.renderFeatureMod.default, T],
    opt_hitExtent: olLib.extentMod.Extent
  ): T = js.native
  /* protected */ def drawReplay(
    gl: stdLib.WebGLRenderingContext,
    context: olLib.webglContextMod.default,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    hitDetection: scala.Boolean
  ): scala.Unit = js.native
  def finish(context: olLib.webglContextMod.default): scala.Unit = js.native
  def getDeleteResourcesFunction(context: olLib.webglContextMod.default): js.Function0[scala.Unit] = js.native
  def replay[T](
    context: olLib.webglContextMod.default,
    center: olLib.coordinateMod.Coordinate,
    resolution: scala.Double,
    rotation: scala.Double,
    size: olLib.sizeMod.Size,
    pixelRatio: scala.Double,
    opacity: scala.Double,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    featureCallback: js.Function1[/* p0 */ olLib.featureMod.default | olLib.renderFeatureMod.default, T],
    oneByOne: scala.Boolean
  ): T = js.native
  def replay[T](
    context: olLib.webglContextMod.default,
    center: olLib.coordinateMod.Coordinate,
    resolution: scala.Double,
    rotation: scala.Double,
    size: olLib.sizeMod.Size,
    pixelRatio: scala.Double,
    opacity: scala.Double,
    skippedFeaturesHash: org.scalablytyped.runtime.StringDictionary[scala.Boolean],
    featureCallback: js.Function1[/* p0 */ olLib.featureMod.default | olLib.renderFeatureMod.default, T],
    oneByOne: scala.Boolean,
    opt_hitExtent: olLib.extentMod.Extent
  ): T = js.native
  /* protected */ def setUpProgram(
    gl: stdLib.WebGLRenderingContext,
    context: olLib.webglContextMod.default,
    size: olLib.sizeMod.Size,
    pixelRatio: scala.Double
  ): olLib.renderWebglCirclereplayDefaultshaderLocationsMod.default | olLib.renderWebglLinestringreplayDefaultshaderLocationsMod.default | olLib.renderWebglPolygonreplayDefaultshaderLocationsMod.default | olLib.renderWebglTexturereplayDefaultshaderLocationsMod.default = js.native
  /* protected */ def shutDownProgram(
    gl: stdLib.WebGLRenderingContext,
    locations: olLib.renderWebglCirclereplayDefaultshaderLocationsMod.default
  ): scala.Unit = js.native
  /* protected */ def shutDownProgram(
    gl: stdLib.WebGLRenderingContext,
    locations: olLib.renderWebglLinestringreplayDefaultshaderLocationsMod.default
  ): scala.Unit = js.native
  /* protected */ def shutDownProgram(
    gl: stdLib.WebGLRenderingContext,
    locations: olLib.renderWebglPolygonreplayDefaultshaderLocationsMod.default
  ): scala.Unit = js.native
  /* protected */ def shutDownProgram(
    gl: stdLib.WebGLRenderingContext,
    locations: olLib.renderWebglTexturereplayDefaultshaderLocationsMod.default
  ): scala.Unit = js.native
}

