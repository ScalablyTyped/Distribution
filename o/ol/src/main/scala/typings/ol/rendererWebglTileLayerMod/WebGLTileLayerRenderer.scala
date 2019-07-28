package typings.ol.rendererWebglTileLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLTileLayerRenderer
  extends typings.ol.rendererWebglLayerMod.default {
  def create(mapRenderer: typings.ol.rendererMapMod.default, layer: typings.ol.layerLayerMod.default): WebGLTileLayerRenderer = js.native
  def handles(layer: typings.ol.layerLayerMod.default): Boolean = js.native
}

