package typings.ol

import typings.ol.olFeatureMod.FeatureLike
import typings.ol.pluggableMapMod.FrameState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/VectorTileLayer", JSImport.Namespace)
@js.native
object vectorTileLayerMod extends js.Object {
  @js.native
  trait CanvasVectorTileLayerRenderer
    extends typings.ol.tileLayerMod.default {
    def prepareTile(
      tile: typings.ol.vectorRenderTileMod.default,
      pixelRatio: Double,
      projection: typings.ol.projectionMod.default,
      queue: Boolean
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      executorGroup: typings.ol.builderGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: typings.ol.styleStyleMod.default,
      executorGroup: typings.ol.builderGroupMod.default
    ): Boolean = js.native
    def renderQueuedTileImages_(hifi: Boolean, frameState: FrameState): Unit = js.native
  }
  
  @js.native
  class default protected () extends CanvasVectorTileLayerRenderer {
    def this(layer: typings.ol.vectorTileMod.default) = this()
  }
  
}

