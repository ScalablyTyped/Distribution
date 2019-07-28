package typings.ol.rendererCanvasIntermediateCanvasMod

import typings.ol.transformMod.Transform
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.HTMLVideoElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IntermediateCanvasRenderer
  extends typings.ol.rendererCanvasLayerMod.default {
  var coordinateToCanvasPixelTransform: Transform = js.native
  def getImage(): HTMLCanvasElement | HTMLVideoElement | HTMLImageElement = js.native
  def getImageTransform(): Transform = js.native
}

