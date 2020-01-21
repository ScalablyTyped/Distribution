package typings.ol

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/ImageLayer", JSImport.Namespace)
@js.native
object imageLayerMod extends js.Object {
  @js.native
  trait CanvasImageLayerRenderer
    extends typings.ol.canvasLayerMod.default[typings.ol.layerLayerMod.default[typings.ol.sourceSourceMod.default]] {
    var image_ : typings.ol.imageBaseMod.default = js.native
  }
  
  @js.native
  class default protected () extends CanvasImageLayerRenderer {
    def this(imageLayer: typings.ol.imageMod.default) = this()
  }
  
}

