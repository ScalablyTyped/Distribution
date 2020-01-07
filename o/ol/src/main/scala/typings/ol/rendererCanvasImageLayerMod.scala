package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/ImageLayer", JSImport.Namespace)
@js.native
object rendererCanvasImageLayerMod extends js.Object {
  @js.native
  trait CanvasImageLayerRenderer
    extends typings.ol.rendererCanvasLayerMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] {
    var image_ : typings.ol.imageBaseMod.default = js.native
  }
  
  @js.native
  class default protected () extends CanvasImageLayerRenderer {
    def this(imageLayer: typings.ol.layerImageMod.default) = this()
  }
  
}

