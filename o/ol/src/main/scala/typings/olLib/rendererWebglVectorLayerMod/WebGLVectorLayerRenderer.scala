package typings
package olLib.rendererWebglVectorLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLVectorLayerRenderer
  extends olLib.rendererWebglLayerMod.default {
  def create(mapRenderer: olLib.rendererMapMod.default, layer: olLib.layerLayerMod.default): WebGLVectorLayerRenderer = js.native
  def handles(layer: olLib.layerLayerMod.default): scala.Boolean = js.native
  def renderFeature(
    feature: olLib.featureMod.default,
    resolution: scala.Double,
    pixelRatio: scala.Double,
    styles: js.Array[olLib.styleStyleMod.default],
    replayGroup: olLib.renderWebglReplayGroupMod.default
  ): scala.Boolean = js.native
  def renderFeature(
    feature: olLib.featureMod.default,
    resolution: scala.Double,
    pixelRatio: scala.Double,
    styles: olLib.styleStyleMod.default,
    replayGroup: olLib.renderWebglReplayGroupMod.default
  ): scala.Boolean = js.native
}

