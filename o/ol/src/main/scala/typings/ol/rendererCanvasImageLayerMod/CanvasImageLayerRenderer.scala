package typings.ol.rendererCanvasImageLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasImageLayerRenderer
  extends typings.ol.rendererCanvasIntermediateCanvasMod.default {
  def create(mapRenderer: typings.ol.rendererMapMod.default, layer: typings.ol.layerLayerMod.default): CanvasImageLayerRenderer = js.native
  def handles(layer: typings.ol.layerLayerMod.default): Boolean = js.native
}

