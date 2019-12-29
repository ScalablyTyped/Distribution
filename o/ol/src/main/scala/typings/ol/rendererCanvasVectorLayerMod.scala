package typings.ol

import typings.ol.layerLayerMod.State
import typings.ol.pluggableMapMod.FrameState
import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/VectorLayer", JSImport.Namespace)
@js.native
object rendererCanvasVectorLayerMod extends js.Object {
  @js.native
  trait CanvasVectorLayerRenderer
    extends typings.ol.rendererCanvasLayerMod.default {
    def compose(context: CanvasRenderingContext2D, frameState: FrameState, layerState: State): Unit = js.native
    def create(mapRenderer: typings.ol.rendererMapMod.default, layer: typings.ol.layerLayerMod.default): CanvasVectorLayerRenderer = js.native
    def handleFontsChanged_(event: typings.ol.eventsEventMod.default): Unit = js.native
    def handles(layer: typings.ol.layerLayerMod.default): Boolean = js.native
    def renderFeature(
      feature: typings.ol.featureMod.default,
      resolution: Double,
      pixelRatio: Double,
      styles: js.Array[typings.ol.styleStyleMod.default],
      replayGroup: typings.ol.renderCanvasReplayGroupMod.default
    ): Boolean = js.native
    def renderFeature(
      feature: typings.ol.featureMod.default,
      resolution: Double,
      pixelRatio: Double,
      styles: typings.ol.styleStyleMod.default,
      replayGroup: typings.ol.renderCanvasReplayGroupMod.default
    ): Boolean = js.native
  }
  
  @js.native
  class default protected () extends CanvasVectorLayerRenderer {
    def this(vectorLayer: typings.ol.layerVectorMod.default) = this()
  }
  
}

