package typings.ol

import typings.ol.transformMod.Transform
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ol/renderer/canvas/IntermediateCanvas", JSImport.Namespace)
@js.native
object rendererCanvasIntermediateCanvasMod extends js.Object {
  @js.native
  trait IntermediateCanvasRenderer
    extends typings.ol.rendererCanvasLayerMod.default {
    var coordinateToCanvasPixelTransform: Transform = js.native
    def getImage(): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
    def getImageTransform(): Transform = js.native
  }
  
  @js.native
  class default protected () extends IntermediateCanvasRenderer {
    def this(layer: typings.ol.layerLayerMod.default) = this()
  }
  
}

