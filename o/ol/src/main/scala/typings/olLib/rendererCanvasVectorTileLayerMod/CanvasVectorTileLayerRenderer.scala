package typings
package olLib.rendererCanvasVectorTileLayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasVectorTileLayerRenderer
  extends olLib.rendererCanvasTileLayerMod.default {
  def handleFontsChanged_(event: olLib.eventsEventMod.default): scala.Unit = js.native
  def renderFeature(
    feature: olLib.featureMod.FeatureLike,
    squaredTolerance: scala.Double,
    styles: js.Array[olLib.styleStyleMod.default],
    replayGroup: olLib.renderCanvasReplayGroupMod.default
  ): scala.Boolean = js.native
  def renderFeature(
    feature: olLib.featureMod.FeatureLike,
    squaredTolerance: scala.Double,
    styles: olLib.styleStyleMod.default,
    replayGroup: olLib.renderCanvasReplayGroupMod.default
  ): scala.Boolean = js.native
}

