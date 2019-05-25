package typings
package olLib.rendererWebglTileLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLTileLayerRenderer
  extends olLib.rendererWebglLayerMod.default {
  def create(mapRenderer: olLib.rendererMapMod.default, layer: olLib.layerLayerMod.default): WebGLTileLayerRenderer = js.native
  def handles(layer: olLib.layerLayerMod.default): scala.Boolean = js.native
}

