package typings
package olLib.rendererWebglImageLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLImageLayerRenderer
  extends olLib.rendererWebglLayerMod.default {
  def create(mapRenderer: olLib.rendererMapMod.default, layer: olLib.layerLayerMod.default): WebGLImageLayerRenderer = js.native
  def handles(layer: olLib.layerLayerMod.default): scala.Boolean = js.native
}

