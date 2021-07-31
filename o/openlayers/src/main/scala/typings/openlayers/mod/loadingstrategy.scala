package typings.openlayers.mod

import typings.openlayers.mod.tilegrid.TileGrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object loadingstrategy {
  
  @JSImport("openlayers", "loadingstrategy")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Strategy function for loading all features with a single request.
    * @param extent Extent.
    * @param resolution Resolution.
    * @return Extents.
    * @api
    */
  @scala.inline
  def all(extent: Extent_, resolution: Double): js.Array[Extent_] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(extent.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any])).asInstanceOf[js.Array[Extent_]]
  
  /**
    * Strategy function for loading features based on the view's extent and
    * resolution.
    * @param extent Extent.
    * @param resolution Resolution.
    * @return Extents.
    * @api
    */
  @scala.inline
  def bbox(extent: Extent_, resolution: Double): js.Array[Extent_] = (^.asInstanceOf[js.Dynamic].applyDynamic("bbox")(extent.asInstanceOf[js.Any], resolution.asInstanceOf[js.Any])).asInstanceOf[js.Array[Extent_]]
  
  /**
    * Creates a strategy function for loading features based on a tile grid.
    * @param tileGrid Tile grid.
    * @return Loading strategy.
    * @api
    */
  @scala.inline
  def tile(tileGrid: TileGrid): js.Function2[/* extent */ Extent_, /* i */ Double, js.Array[Extent_]] = ^.asInstanceOf[js.Dynamic].applyDynamic("tile")(tileGrid.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* extent */ Extent_, /* i */ Double, js.Array[Extent_]]]
}
