package typings.ol.tilegridTileGridMod

import typings.ol.coordinateMod.Coordinate
import typings.ol.extentMod.Extent
import typings.ol.sizeMod.Size
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileGrid extends js.Object {
  var maxZoom: Double = js.native
  var minZoom: Double = js.native
  def forEachTileCoord(extent: Extent, zoom: Double, callback: js.Function1[/* p0 */ TileCoord, Unit]): Unit = js.native
  def forEachTileCoordParentTileRange[T](
    tileCoord: TileCoord,
    callback: js.ThisFunction2[/* this */ T, /* p0 */ Double, /* p1 */ typings.ol.tileRangeMod.default, Boolean]
  ): Boolean = js.native
  def forEachTileCoordParentTileRange[T](
    tileCoord: TileCoord,
    callback: js.ThisFunction2[/* this */ T, /* p0 */ Double, /* p1 */ typings.ol.tileRangeMod.default, Boolean],
    opt_this: T
  ): Boolean = js.native
  def forEachTileCoordParentTileRange[T](
    tileCoord: TileCoord,
    callback: js.ThisFunction2[/* this */ T, /* p0 */ Double, /* p1 */ typings.ol.tileRangeMod.default, Boolean],
    opt_this: T,
    opt_tileRange: typings.ol.tileRangeMod.default
  ): Boolean = js.native
  def forEachTileCoordParentTileRange[T](
    tileCoord: TileCoord,
    callback: js.ThisFunction2[/* this */ T, /* p0 */ Double, /* p1 */ typings.ol.tileRangeMod.default, Boolean],
    opt_this: T,
    opt_tileRange: typings.ol.tileRangeMod.default,
    opt_extent: Extent
  ): Boolean = js.native
  def getExtent(): Extent = js.native
  def getFullTileRange(z: Double): typings.ol.tileRangeMod.default = js.native
  def getMaxZoom(): Double = js.native
  def getMinZoom(): Double = js.native
  def getOrigin(z: Double): Coordinate = js.native
  def getResolution(z: Double): Double = js.native
  def getResolutions(): js.Array[Double] = js.native
  def getTileCoordCenter(tileCoord: TileCoord): Coordinate = js.native
  def getTileCoordChildTileRange(tileCoord: TileCoord): typings.ol.tileRangeMod.default = js.native
  def getTileCoordChildTileRange(tileCoord: TileCoord, opt_tileRange: typings.ol.tileRangeMod.default): typings.ol.tileRangeMod.default = js.native
  def getTileCoordChildTileRange(tileCoord: TileCoord, opt_tileRange: typings.ol.tileRangeMod.default, opt_extent: Extent): typings.ol.tileRangeMod.default = js.native
  def getTileCoordExtent(tileCoord: TileCoord): Extent = js.native
  def getTileCoordExtent(tileCoord: TileCoord, opt_extent: Extent): Extent = js.native
  def getTileCoordForCoordAndResolution(coordinate: Coordinate, resolution: Double): TileCoord = js.native
  def getTileCoordForCoordAndResolution(coordinate: Coordinate, resolution: Double, opt_tileCoord: TileCoord): TileCoord = js.native
  def getTileCoordForCoordAndZ(coordinate: Coordinate, z: Double): TileCoord = js.native
  def getTileCoordForCoordAndZ(coordinate: Coordinate, z: Double, opt_tileCoord: TileCoord): TileCoord = js.native
  def getTileCoordResolution(tileCoord: TileCoord): Double = js.native
  def getTileRangeExtent(z: Double, tileRange: typings.ol.tileRangeMod.default): Extent = js.native
  def getTileRangeExtent(z: Double, tileRange: typings.ol.tileRangeMod.default, opt_extent: Extent): Extent = js.native
  def getTileRangeForExtentAndZ(extent: Extent, z: Double): typings.ol.tileRangeMod.default = js.native
  def getTileRangeForExtentAndZ(extent: Extent, z: Double, opt_tileRange: typings.ol.tileRangeMod.default): typings.ol.tileRangeMod.default = js.native
  def getTileSize(z: Double): Double | Size = js.native
  def getZForResolution(resolution: Double): Double = js.native
  def getZForResolution(resolution: Double, opt_direction: Double): Double = js.native
}

