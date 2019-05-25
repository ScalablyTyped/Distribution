package typings
package olLib.rendererCanvasVectorLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasVectorLayerRenderer
  extends olLib.rendererCanvasLayerMod.default {
  def compose(
    context: stdLib.CanvasRenderingContext2D,
    frameState: olLib.pluggableMapMod.FrameState,
    layerState: olLib.layerLayerMod.State
  ): scala.Unit = js.native
  def create(mapRenderer: olLib.rendererMapMod.default, layer: olLib.layerLayerMod.default): CanvasVectorLayerRenderer = js.native
  def handleFontsChanged_(event: olLib.eventsEventMod.default): scala.Unit = js.native
  def handles(layer: olLib.layerLayerMod.default): scala.Boolean = js.native
  def renderFeature(
    feature: olLib.featureMod.default,
    resolution: scala.Double,
    pixelRatio: scala.Double,
    styles: js.Array[olLib.styleStyleMod.default],
    replayGroup: olLib.renderCanvasReplayGroupMod.default
  ): scala.Boolean = js.native
  def renderFeature(
    feature: olLib.featureMod.default,
    resolution: scala.Double,
    pixelRatio: scala.Double,
    styles: olLib.styleStyleMod.default,
    replayGroup: olLib.renderCanvasReplayGroupMod.default
  ): scala.Boolean = js.native
}

