package typings.openlayers.mod

import typings.openlayers.mod.tilegrid.TileGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingstrategy {
  
  /**
    * Strategy function for loading all features with a single request.
    * @param extent Extent.
    * @param resolution Resolution.
    * @return Extents.
    * @api
    */
  @JSImport("openlayers", "loadingstrategy.all")
  @js.native
  def all(extent: Extent_, resolution: Double): js.Array[Extent_] = js.native
  
  /**
    * Strategy function for loading features based on the view's extent and
    * resolution.
    * @param extent Extent.
    * @param resolution Resolution.
    * @return Extents.
    * @api
    */
  @JSImport("openlayers", "loadingstrategy.bbox")
  @js.native
  def bbox(extent: Extent_, resolution: Double): js.Array[Extent_] = js.native
  
  /**
    * Creates a strategy function for loading features based on a tile grid.
    * @param tileGrid Tile grid.
    * @return Loading strategy.
    * @api
    */
  @JSImport("openlayers", "loadingstrategy.tile")
  @js.native
  def tile(tileGrid: TileGrid): js.Function2[/* extent */ Extent_, /* i */ Double, js.Array[Extent_]] = js.native
}
