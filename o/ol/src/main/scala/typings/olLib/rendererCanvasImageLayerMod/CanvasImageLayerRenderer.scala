package typings
package olLib.rendererCanvasImageLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasImageLayerRenderer
  extends olLib.rendererCanvasIntermediateCanvasMod.default {
  def create(mapRenderer: olLib.rendererMapMod.default, layer: olLib.layerLayerMod.default): CanvasImageLayerRenderer = js.native
  def handles(layer: olLib.layerLayerMod.default): scala.Boolean = js.native
}

