package typings.ol

import typings.ol.rendererCanvasImageLayerMod.CanvasImageLayerRenderer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/ImageLayer", JSImport.Namespace)
@js.native
object rendererCanvasImageLayerMod extends js.Object {
  @js.native
  trait CanvasImageLayerRenderer
    extends typings.ol.rendererCanvasIntermediateCanvasMod.default {
    def create(mapRenderer: typings.ol.rendererMapMod.default, layer: typings.ol.layerLayerMod.default): CanvasImageLayerRenderer = js.native
    def handles(layer: typings.ol.layerLayerMod.default): Boolean = js.native
  }
  
  @js.native
  class default protected () extends CanvasImageLayerRenderer {
    def this(imageLayer: typings.ol.layerImageMod.default) = this()
    def this(imageLayer: typings.ol.layerVectorMod.default) = this()
  }
  
}

