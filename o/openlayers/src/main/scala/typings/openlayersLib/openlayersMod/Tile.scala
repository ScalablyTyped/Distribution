package typings
package openlayersLib.openlayersMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "Tile")
@js.native
class Tile protected ()
  extends openlayersLib.openlayersMod.eventsNs.EventTarget {
  /**
    * @classdesc
    * Base class for tiles.
    *
    * @param tileCoord Tile coordinate.
    * @param state State.
    */
  def this(tileCoord: TileCoord, state: openlayersLib.openlayersMod.TileNs.State) = this()
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
  def load(): scala.Unit = js.native
}

