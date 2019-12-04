package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.renderWebglReplayMod.WebGLReplay
import typings.ol.sizeMod.Size
import typings.std.WebGLRenderingContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/render/webgl/Replay", JSImport.Namespace)
@js.native
object renderWebglReplayMod extends js.Object {
  @js.native
  trait WebGLReplay
    extends typings.ol.renderVectorContextMod.default {
    var indices: js.Array[Double] = js.native
    var indicesBuffer: typings.ol.webglBufferMod.default = js.native
    var lineStringReplay: typings.ol.renderWebglLineStringReplayMod.default = js.native
    var maxExtent: Extent = js.native
    var origin: Coordinate = js.native
    var startIndices: js.Array[Double] = js.native
    var startIndicesFeature: js.Array[typings.ol.featureMod.default | typings.ol.renderFeatureMod.default] = js.native
    var tolerance: Double = js.native
    var vertices: js.Array[Double] = js.native
    var verticesBuffer: typings.ol.webglBufferMod.default = js.native
    /* protected */ def drawElements(gl: WebGLRenderingContext, context: typings.ol.webglContextMod.default, start: Double, end: Double): Unit = js.native
    /* protected */ def drawHitDetectionReplay[T](
      gl: WebGLRenderingContext,
      context: typings.ol.webglContextMod.default,
      skippedFeaturesHash: StringDictionary[Boolean],
      featureCallback: js.Function1[
          /* p0 */ typings.ol.featureMod.default | typings.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ],
      oneByOne: Boolean
    ): js.UndefOr[T] = js.native
    /* protected */ def drawHitDetectionReplay[T](
      gl: WebGLRenderingContext,
      context: typings.ol.webglContextMod.default,
      skippedFeaturesHash: StringDictionary[Boolean],
      featureCallback: js.Function1[
          /* p0 */ typings.ol.featureMod.default | typings.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ],
      oneByOne: Boolean,
      opt_hitExtent: Extent
    ): js.UndefOr[T] = js.native
    /* protected */ def drawHitDetectionReplayAll[T](
      gl: WebGLRenderingContext,
      context: typings.ol.webglContextMod.default,
      skippedFeaturesHash: StringDictionary[Boolean],
      featureCallback: js.Function1[
          /* p0 */ typings.ol.featureMod.default | typings.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ]
    ): js.UndefOr[T] = js.native
    /* protected */ def drawHitDetectionReplayOneByOne[T](
      gl: WebGLRenderingContext,
      context: typings.ol.webglContextMod.default,
      skippedFeaturesHash: StringDictionary[Boolean],
      featureCallback: js.Function1[
          /* p0 */ typings.ol.featureMod.default | typings.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ]
    ): js.UndefOr[T] = js.native
    /* protected */ def drawHitDetectionReplayOneByOne[T](
      gl: WebGLRenderingContext,
      context: typings.ol.webglContextMod.default,
      skippedFeaturesHash: StringDictionary[Boolean],
      featureCallback: js.Function1[
          /* p0 */ typings.ol.featureMod.default | typings.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ],
      opt_hitExtent: Extent
    ): js.UndefOr[T] = js.native
    /* protected */ def drawReplay(
      gl: WebGLRenderingContext,
      context: typings.ol.webglContextMod.default,
      skippedFeaturesHash: StringDictionary[Boolean],
      hitDetection: Boolean
    ): Unit = js.native
    def finish(context: typings.ol.webglContextMod.default): Unit = js.native
    def getDeleteResourcesFunction(context: typings.ol.webglContextMod.default): js.Function0[Unit] = js.native
    def replay[T](
      context: typings.ol.webglContextMod.default,
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      size: Size,
      pixelRatio: Double,
      opacity: Double,
      skippedFeaturesHash: StringDictionary[Boolean],
      featureCallback: js.Function1[
          /* p0 */ typings.ol.featureMod.default | typings.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ],
      oneByOne: Boolean
    ): js.UndefOr[T] = js.native
    def replay[T](
      context: typings.ol.webglContextMod.default,
      center: Coordinate,
      resolution: Double,
      rotation: Double,
      size: Size,
      pixelRatio: Double,
      opacity: Double,
      skippedFeaturesHash: StringDictionary[Boolean],
      featureCallback: js.Function1[
          /* p0 */ typings.ol.featureMod.default | typings.ol.renderFeatureMod.default, 
          js.UndefOr[T]
        ],
      oneByOne: Boolean,
      opt_hitExtent: Extent
    ): js.UndefOr[T] = js.native
    /* protected */ def setUpProgram(
      gl: WebGLRenderingContext,
      context: typings.ol.webglContextMod.default,
      size: Size,
      pixelRatio: Double
    ): typings.ol.renderWebglCirclereplayDefaultshaderLocationsMod.default | typings.ol.renderWebglLinestringreplayDefaultshaderLocationsMod.default | typings.ol.renderWebglPolygonreplayDefaultshaderLocationsMod.default | typings.ol.renderWebglTexturereplayDefaultshaderLocationsMod.default = js.native
    /* protected */ def shutDownProgram(
      gl: WebGLRenderingContext,
      locations: typings.ol.renderWebglCirclereplayDefaultshaderLocationsMod.default
    ): Unit = js.native
    /* protected */ def shutDownProgram(
      gl: WebGLRenderingContext,
      locations: typings.ol.renderWebglLinestringreplayDefaultshaderLocationsMod.default
    ): Unit = js.native
    /* protected */ def shutDownProgram(
      gl: WebGLRenderingContext,
      locations: typings.ol.renderWebglPolygonreplayDefaultshaderLocationsMod.default
    ): Unit = js.native
    /* protected */ def shutDownProgram(
      gl: WebGLRenderingContext,
      locations: typings.ol.renderWebglTexturereplayDefaultshaderLocationsMod.default
    ): Unit = js.native
  }
  
  @js.native
  class default protected () extends WebGLReplay {
    def this(tolerance: Double, maxExtent: Extent) = this()
  }
  
}

