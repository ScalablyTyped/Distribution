package typings.ol

import typings.ol.featureMod.FeatureLike
import typings.ol.rendererCanvasVectorTileLayerMod.CanvasVectorTileLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/VectorTileLayer", JSImport.Namespace)
@js.native
object rendererCanvasVectorTileLayerMod extends js.Object {
  @js.native
  trait CanvasVectorTileLayerRenderer
    extends typings.ol.rendererCanvasTileLayerMod.default {
    def handleFontsChanged_(event: typings.ol.eventsEventMod.default): Unit = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      replayGroup: typings.ol.renderCanvasReplayGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: FeatureLike,
      squaredTolerance: Double,
      styles: typings.ol.styleStyleMod.default,
      replayGroup: typings.ol.renderCanvasReplayGroupMod.default
    ): Boolean = js.native
  }
  
  @js.native
  class default protected () extends CanvasVectorTileLayerRenderer {
    def this(layer: typings.ol.layerVectorTileMod.default) = this()
  }
  
}

