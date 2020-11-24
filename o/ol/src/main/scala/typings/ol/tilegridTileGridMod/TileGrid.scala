package typings.ol.tilegridTileGridMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.sizeMod.Size
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileGrid extends js.Object {
  
  /**
    * Call a function with each tile coordinate for a given extent and zoom level.
    */
  def forEachTileCoord(extent: Extent, zoom: Double, callback: js.Function1[/* p0 */ TileCoord, Unit]): Unit = js.native
  
  def forEachTileCoordParentTileRange(
    tileCoord: TileCoord,
    callback: js.Function2[/* p0 */ Double, /* p1 */ typings.ol.tileRangeMod.default, Boolean]
  ): Boolean = js.native
  def forEachTileCoordParentTileRange(
    tileCoord: TileCoord,
    callback: js.Function2[/* p0 */ Double, /* p1 */ typings.ol.tileRangeMod.default, Boolean],
    opt_tileRange: js.UndefOr[scala.Nothing],
    opt_extent: Extent
  ): Boolean = js.native
  def forEachTileCoordParentTileRange(
    tileCoord: TileCoord,
    callback: js.Function2[/* p0 */ Double, /* p1 */ typings.ol.tileRangeMod.default, Boolean],
    opt_tileRange: typings.ol.tileRangeMod.default
  ): Boolean = js.native
  def forEachTileCoordParentTileRange(
    tileCoord: TileCoord,
    callback: js.Function2[/* p0 */ Double, /* p1 */ typings.ol.tileRangeMod.default, Boolean],
    opt_tileRange: typings.ol.tileRangeMod.default,
    opt_extent: Extent
  ): Boolean = js.native
  
  /**
    * Get the extent for this tile grid, if it was configured.
    */
  def getExtent(): Extent = js.native
  
  def getFullTileRange(z: Double): typings.ol.tileRangeMod.default = js.native
  
  /**
    * Get the maximum zoom level for the grid.
    */
  def getMaxZoom(): Double = js.native
  
  /**
    * Get the minimum zoom level for the grid.
    */
  def getMinZoom(): Double = js.native
  
  /**
    * Get the origin for the grid at the given zoom level.
    */
  def getOrigin(z: Double): Coordinate = js.native
  
  /**
    * Get the resolution for the given zoom level.
    */
  def getResolution(z: Double): Double = js.native
  
  /**
    * Get the list of resolutions for the tile grid.
    */
  def getResolutions(): js.Array[Double] = js.native
  
  def getTileCoordCenter(tileCoord: TileCoord): Coordinate = js.native
  
  def getTileCoordChildTileRange(tileCoord: TileCoord): typings.ol.tileRangeMod.default = js.native
  def getTileCoordChildTileRange(tileCoord: TileCoord, opt_tileRange: js.UndefOr[scala.Nothing], opt_extent: Extent): typings.ol.tileRangeMod.default = js.native
  def getTileCoordChildTileRange(tileCoord: TileCoord, opt_tileRange: typings.ol.tileRangeMod.default): typings.ol.tileRangeMod.default = js.native
  def getTileCoordChildTileRange(tileCoord: TileCoord, opt_tileRange: typings.ol.tileRangeMod.default, opt_extent: Extent): typings.ol.tileRangeMod.default = js.native
  
  /**
    * Get the extent of a tile coordinate.
    */
  def getTileCoordExtent(tileCoord: TileCoord): Extent = js.native
  def getTileCoordExtent(tileCoord: TileCoord, opt_extent: Extent): Extent = js.native
  
  /**
    * Get the tile coordinate for the given map coordinate and resolution.  This
    * method considers that coordinates that intersect tile boundaries should be
    * assigned the higher tile coordinate.
    */
  def getTileCoordForCoordAndResolution(coordinate: Coordinate, resolution: Double): TileCoord = js.native
  def getTileCoordForCoordAndResolution(coordinate: Coordinate, resolution: Double, opt_tileCoord: TileCoord): TileCoord = js.native
  
  /**
    * Get a tile coordinate given a map coordinate and zoom level.
    */
  def getTileCoordForCoordAndZ(coordinate: Coordinate, z: Double): TileCoord = js.native
  def getTileCoordForCoordAndZ(coordinate: Coordinate, z: Double, opt_tileCoord: TileCoord): TileCoord = js.native
  
  def getTileCoordResolution(tileCoord: TileCoord): Double = js.native
  
  /**
    * Get the extent for a tile range.
    */
  def getTileRangeExtent(z: Double, tileRange: typings.ol.tileRangeMod.default): Extent = js.native
  def getTileRangeExtent(z: Double, tileRange: typings.ol.tileRangeMod.default, opt_extent: Extent): Extent = js.native
  
  /**
    * Get a tile range for the given extent and integer zoom level.
    */
  def getTileRangeForExtentAndZ(extent: Extent, z: Double): typings.ol.tileRangeMod.default = js.native
  def getTileRangeForExtentAndZ(extent: Extent, z: Double, opt_tileRange: typings.ol.tileRangeMod.default): typings.ol.tileRangeMod.default = js.native
  
  /**
    * Get the tile size for a zoom level. The type of the return value matches the
    * tileSize or tileSizes that the tile grid was configured with. To always
    * get an module:ol/size~Size, run the result through module:ol/size~Size.toSize().
    */
  def getTileSize(z: Double): Double | Size = js.native
  
  def getZForResolution(resolution: Double): Double = js.native
  def getZForResolution(resolution: Double, opt_direction: Double): Double = js.native
  
  var maxZoom: Double = js.native
  
  var minZoom: Double = js.native
}
