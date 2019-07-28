package typings.ol.rendererCanvasVectorTileLayerMod

import typings.ol.featureMod.FeatureLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CanvasVectorTileLayerRenderer
  extends typings.ol.rendererCanvasTileLayerMod.default {
  def handleFontsChanged_(event: typings.ol.eventsEventMod.default): Unit = js.native
  def renderFeature(
    feature: FeatureLike,
    squaredTolerance: Double,
    styles: js.Array[typings.ol.styleStyleMod.default],
    replayGroup: typings.ol.renderCanvasReplayGroupMod.default
  ): Boolean = js.native
  def renderFeature(
    feature: FeatureLike,
    squaredTolerance: Double,
    styles: typings.ol.styleStyleMod.default,
    replayGroup: typings.ol.renderCanvasReplayGroupMod.default
  ): Boolean = js.native
}

