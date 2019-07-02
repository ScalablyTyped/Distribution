package typings
package olLib.sourceTileMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TileSource
  extends olLib.sourceSourceMod.default {
  var tileCache: olLib.tileCacheMod.default = js.native
  var tileGrid: olLib.tilegridTileGridMod.default = js.native
  var tileOptions: olLib.tileMod.Options = js.native
  var tmpSize: olLib.sizeMod.Size = js.native
  def canExpireCache(): scala.Boolean = js.native
  def expireCache(
    projection: olLib.projProjectionMod.default,
    usedTiles: org.scalablytyped.runtime.StringDictionary[olLib.tileRangeMod.default]
  ): scala.Unit = js.native
  def forEachLoadedTile(
    projection: olLib.projProjectionMod.default,
    z: scala.Double,
    tileRange: olLib.tileRangeMod.default,
    callback: js.Function1[/* p0 */ olLib.tileMod.default, scala.Boolean]
  ): scala.Boolean = js.native
  def getGutterForProjection(projection: olLib.projProjectionMod.default): scala.Double = js.native
  /* protected */ def getKey(): java.lang.String = js.native
  def getOpaque(projection: olLib.projProjectionMod.default): scala.Boolean = js.native
  def getTile(
    z: scala.Double,
    x: scala.Double,
    y: scala.Double,
    pixelRatio: scala.Double,
    projection: olLib.projProjectionMod.default
  ): olLib.tileMod.default = js.native
  /* protected */ def getTileCacheForProjection(projection: olLib.projProjectionMod.default): olLib.tileCacheMod.default = js.native
  def getTileCoordForTileUrlFunction(tileCoord: olLib.tilecoordMod.TileCoord): olLib.tilecoordMod.TileCoord = js.native
  def getTileCoordForTileUrlFunction(tileCoord: olLib.tilecoordMod.TileCoord, opt_projection: olLib.projProjectionMod.default): olLib.tilecoordMod.TileCoord = js.native
  def getTileGrid(): olLib.tilegridTileGridMod.default = js.native
  def getTileGridForProjection(projection: olLib.projProjectionMod.default): olLib.tilegridTileGridMod.default = js.native
  def getTilePixelRatio(pixelRatio: scala.Double): scala.Double = js.native
  def getTilePixelSize(z: scala.Double, pixelRatio: scala.Double, projection: olLib.projProjectionMod.default): olLib.sizeMod.Size = js.native
  /* protected */ def setKey(key: java.lang.String): scala.Unit = js.native
  def useTile(z: scala.Double, x: scala.Double, y: scala.Double, projection: olLib.projProjectionMod.default): scala.Unit = js.native
}

