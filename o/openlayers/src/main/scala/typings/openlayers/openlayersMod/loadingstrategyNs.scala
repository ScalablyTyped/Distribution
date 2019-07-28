package typings.openlayers.openlayersMod

import typings.openlayers.openlayersMod.tilegridNs.TileGrid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openlayers", "loadingstrategy")
@js.native
object loadingstrategyNs extends js.Object {
  /**
    * Strategy function for loading all features with a single request.
    * @param extent Extent.
    * @param resolution Resolution.
    * @return Extents.
    * @api
    */
  def all(extent: Extent, resolution: Double): js.Array[Extent] = js.native
  /**
    * Strategy function for loading features based on the view's extent and
    * resolution.
    * @param extent Extent.
    * @param resolution Resolution.
    * @return Extents.
    * @api
    */
  def bbox(extent: Extent, resolution: Double): js.Array[Extent] = js.native
  /**
    * Creates a strategy function for loading features based on a tile grid.
    * @param tileGrid Tile grid.
    * @return Loading strategy.
    * @api
    */
  def tile(tileGrid: TileGrid): js.Function2[/* extent */ Extent, /* i */ Double, js.Array[Extent]] = js.native
}

