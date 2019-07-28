package typings.ol.rendererWebglImageLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLImageLayerRenderer
  extends typings.ol.rendererWebglLayerMod.default {
  def create(mapRenderer: typings.ol.rendererMapMod.default, layer: typings.ol.layerLayerMod.default): WebGLImageLayerRenderer = js.native
  def handles(layer: typings.ol.layerLayerMod.default): Boolean = js.native
}

