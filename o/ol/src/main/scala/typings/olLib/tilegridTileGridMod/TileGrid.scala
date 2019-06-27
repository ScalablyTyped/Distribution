package typings
package olLib.tilegridTileGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileGrid extends js.Object {
  var maxZoom: scala.Double = js.native
  var minZoom: scala.Double = js.native
  def forEachTileCoord(
    extent: olLib.extentMod.Extent,
    zoom: scala.Double,
    callback: js.Function1[/* p0 */ olLib.tilecoordMod.TileCoord, scala.Unit]
  ): scala.Unit = js.native
  def forEachTileCoordParentTileRange[T](
    tileCoord: olLib.tilecoordMod.TileCoord,
    callback: js.ThisFunction2[
      /* this */ T, 
      /* p1 */ scala.Double, 
      /* p2 */ olLib.tileRangeMod.default, 
      scala.Boolean
    ]
  ): scala.Boolean = js.native
  def forEachTileCoordParentTileRange[T](
    tileCoord: olLib.tilecoordMod.TileCoord,
    callback: js.ThisFunction2[
      /* this */ T, 
      /* p1 */ scala.Double, 
      /* p2 */ olLib.tileRangeMod.default, 
      scala.Boolean
    ],
    opt_this: T
  ): scala.Boolean = js.native
  def forEachTileCoordParentTileRange[T](
    tileCoord: olLib.tilecoordMod.TileCoord,
    callback: js.ThisFunction2[
      /* this */ T, 
      /* p1 */ scala.Double, 
      /* p2 */ olLib.tileRangeMod.default, 
      scala.Boolean
    ],
    opt_this: T,
    opt_tileRange: olLib.tileRangeMod.default
  ): scala.Boolean = js.native
  def forEachTileCoordParentTileRange[T](
    tileCoord: olLib.tilecoordMod.TileCoord,
    callback: js.ThisFunction2[
      /* this */ T, 
      /* p1 */ scala.Double, 
      /* p2 */ olLib.tileRangeMod.default, 
      scala.Boolean
    ],
    opt_this: T,
    opt_tileRange: olLib.tileRangeMod.default,
    opt_extent: olLib.extentMod.Extent
  ): scala.Boolean = js.native
  def getExtent(): olLib.extentMod.Extent = js.native
  def getFullTileRange(z: scala.Double): olLib.tileRangeMod.default = js.native
  def getMaxZoom(): scala.Double = js.native
  def getMinZoom(): scala.Double = js.native
  def getOrigin(z: scala.Double): olLib.coordinateMod.Coordinate = js.native
  def getResolution(z: scala.Double): scala.Double = js.native
  def getResolutions(): js.Array[scala.Double] = js.native
  def getTileCoordCenter(tileCoord: olLib.tilecoordMod.TileCoord): olLib.coordinateMod.Coordinate = js.native
  def getTileCoordChildTileRange(tileCoord: olLib.tilecoordMod.TileCoord): olLib.tileRangeMod.default = js.native
  def getTileCoordChildTileRange(tileCoord: olLib.tilecoordMod.TileCoord, opt_tileRange: olLib.tileRangeMod.default): olLib.tileRangeMod.default = js.native
  def getTileCoordChildTileRange(
    tileCoord: olLib.tilecoordMod.TileCoord,
    opt_tileRange: olLib.tileRangeMod.default,
    opt_extent: olLib.extentMod.Extent
  ): olLib.tileRangeMod.default = js.native
  def getTileCoordExtent(tileCoord: olLib.tilecoordMod.TileCoord): olLib.extentMod.Extent = js.native
  def getTileCoordExtent(tileCoord: olLib.tilecoordMod.TileCoord, opt_extent: olLib.extentMod.Extent): olLib.extentMod.Extent = js.native
  def getTileCoordForCoordAndResolution(coordinate: olLib.coordinateMod.Coordinate, resolution: scala.Double): olLib.tilecoordMod.TileCoord = js.native
  def getTileCoordForCoordAndResolution(
    coordinate: olLib.coordinateMod.Coordinate,
    resolution: scala.Double,
    opt_tileCoord: olLib.tilecoordMod.TileCoord
  ): olLib.tilecoordMod.TileCoord = js.native
  def getTileCoordForCoordAndZ(coordinate: olLib.coordinateMod.Coordinate, z: scala.Double): olLib.tilecoordMod.TileCoord = js.native
  def getTileCoordForCoordAndZ(
    coordinate: olLib.coordinateMod.Coordinate,
    z: scala.Double,
    opt_tileCoord: olLib.tilecoordMod.TileCoord
  ): olLib.tilecoordMod.TileCoord = js.native
  def getTileCoordResolution(tileCoord: olLib.tilecoordMod.TileCoord): scala.Double = js.native
  def getTileRangeExtent(z: scala.Double, tileRange: olLib.tileRangeMod.default): olLib.extentMod.Extent = js.native
  def getTileRangeExtent(z: scala.Double, tileRange: olLib.tileRangeMod.default, opt_extent: olLib.extentMod.Extent): olLib.extentMod.Extent = js.native
  def getTileRangeForExtentAndZ(extent: olLib.extentMod.Extent, z: scala.Double): olLib.tileRangeMod.default = js.native
  def getTileRangeForExtentAndZ(extent: olLib.extentMod.Extent, z: scala.Double, opt_tileRange: olLib.tileRangeMod.default): olLib.tileRangeMod.default = js.native
  def getTileSize(z: scala.Double): scala.Double | olLib.sizeMod.Size = js.native
  def getZForResolution(resolution: scala.Double): scala.Double = js.native
  def getZForResolution(resolution: scala.Double, opt_direction: scala.Double): scala.Double = js.native
}

