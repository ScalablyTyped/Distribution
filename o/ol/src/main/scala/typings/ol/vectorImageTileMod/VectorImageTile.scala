package typings.ol.vectorImageTileMod

import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorImageTile
  extends typings.ol.tileMod.default {
  def getContext(layer: typings.ol.layerLayerMod.default): CanvasRenderingContext2D = js.native
  def getImage(layer: typings.ol.layerLayerMod.default): HTMLCanvasElement = js.native
  def getReplayState(layer: typings.ol.layerLayerMod.default): ReplayState = js.native
  def getTile(tileKey: String): typings.ol.vectorTileMod.default = js.native
}

