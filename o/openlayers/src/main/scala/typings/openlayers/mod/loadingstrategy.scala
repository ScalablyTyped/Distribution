package typings.openlayers.mod

import typings.openlayers.mod.tilegrid.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "loadingstrategy")
@js.native
object loadingstrategy extends js.Object {
  /**
    * Strategy function for loading all features with a single request.
    * @param extent Extent.
    * @param resolution Resolution.
    * @return Extents.
    * @api
    */
  def all(extent: Extent_, resolution: Double): js.Array[Extent_] = js.native
  /**
    * Strategy function for loading features based on the view's extent and
    * resolution.
    * @param extent Extent.
    * @param resolution Resolution.
    * @return Extents.
    * @api
    */
  def bbox(extent: Extent_, resolution: Double): js.Array[Extent_] = js.native
  /**
    * Creates a strategy function for loading features based on a tile grid.
    * @param tileGrid Tile grid.
    * @return Loading strategy.
    * @api
    */
  def tile(tileGrid: TileGrid): js.Function2[/* extent */ Extent_, /* i */ Double, js.Array[Extent_]] = js.native
}

