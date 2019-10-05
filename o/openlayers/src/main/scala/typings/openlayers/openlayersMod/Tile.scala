package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.Tile.State
import typings.openlayers.openlayersMod.events.EventTarget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "Tile")
@js.native
class Tile protected () extends EventTarget {
  /**
    * @classdesc
    * Base class for tiles.
    *
    * @param tileCoord Tile coordinate.
    * @param state State.
    */
  def this(tileCoord: TileCoord, state: State) = this()
  /**
    * Get the tile coordinate for this tile.
    * @return The tile coordinate.
    * @api
    */
  def getTileCoord(): TileCoord = js.native
  /**
    * Load the image or retry if loading previously failed.
    * Loading is taken care of by the tile queue, and calling this method is
    * only needed for preloading or for reloading in case of an error.
    * @api
    */
  def load(): Unit = js.native
}

@JSImport("openlayers", "Tile")
@js.native
object Tile extends js.Object {
  type State = Double
}

