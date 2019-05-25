package typings
package olLib.rendererCanvasIntermediateCanvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntermediateCanvasRenderer
  extends olLib.rendererCanvasLayerMod.default {
  var coordinateToCanvasPixelTransform: olLib.transformMod.Transform = js.native
  def getImage(): stdLib.HTMLCanvasElement | stdLib.HTMLVideoElement | stdLib.HTMLImageElement = js.native
  def getImageTransform(): olLib.transformMod.Transform = js.native
}

