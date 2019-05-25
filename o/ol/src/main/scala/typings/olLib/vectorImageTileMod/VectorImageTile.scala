package typings
package olLib.vectorImageTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VectorImageTile
  extends olLib.tileMod.default {
  def getContext(layer: olLib.layerLayerMod.default): stdLib.CanvasRenderingContext2D = js.native
  def getImage(layer: olLib.layerLayerMod.default): stdLib.HTMLCanvasElement = js.native
  def getReplayState(layer: olLib.layerLayerMod.default): ReplayState = js.native
  def getTile(tileKey: java.lang.String): olLib.vectorTileMod.default = js.native
}

