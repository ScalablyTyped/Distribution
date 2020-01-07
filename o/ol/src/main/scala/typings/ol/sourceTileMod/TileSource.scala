package typings.ol.sourceTileMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.sizeMod.Size
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileSource
  extends typings.ol.sourceSourceMod.default {
  var tileCache: typings.ol.tileCacheMod.default = js.native
  var tileGrid: typings.ol.tilegridTileGridMod.default = js.native
  var tileOptions: typings.ol.tileMod.Options = js.native
  var tmpSize: Size = js.native
  def canExpireCache(): Boolean = js.native
  def clear(): Unit = js.native
  def expireCache(
    projection: typings.ol.projProjectionMod.default,
    usedTiles: StringDictionary[typings.ol.tileRangeMod.default]
  ): Unit = js.native
  def forEachLoadedTile(
    projection: typings.ol.projProjectionMod.default,
    z: Double,
    tileRange: typings.ol.tileRangeMod.default,
    callback: js.Function1[/* p0 */ typings.ol.tileMod.default, Boolean]
  ): Boolean = js.native
  def getGutterForProjection(projection: typings.ol.projProjectionMod.default): Double = js.native
  /* protected */ def getKey(): String = js.native
  def getOpaque(projection: typings.ol.projProjectionMod.default): Boolean = js.native
  def getTile(
    z: Double,
    x: Double,
    y: Double,
    pixelRatio: Double,
    projection: typings.ol.projProjectionMod.default
  ): typings.ol.tileMod.default = js.native
  /* protected */ def getTileCacheForProjection(projection: typings.ol.projProjectionMod.default): typings.ol.tileCacheMod.default = js.native
  def getTileCoordForTileUrlFunction(tileCoord: TileCoord): TileCoord = js.native
  def getTileCoordForTileUrlFunction(tileCoord: TileCoord, opt_projection: typings.ol.projProjectionMod.default): TileCoord = js.native
  def getTileGrid(): typings.ol.tilegridTileGridMod.default = js.native
  def getTileGridForProjection(projection: typings.ol.projProjectionMod.default): typings.ol.tilegridTileGridMod.default = js.native
  def getTilePixelRatio(pixelRatio: Double): Double = js.native
  def getTilePixelSize(z: Double, pixelRatio: Double, projection: typings.ol.projProjectionMod.default): Size = js.native
  /* protected */ def setKey(key: String): Unit = js.native
  def useTile(z: Double, x: Double, y: Double, projection: typings.ol.projProjectionMod.default): Unit = js.native
}

