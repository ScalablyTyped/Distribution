package typings.ol.sourceTileMod

import org.scalablytyped.runtime.StringDictionary
import typings.ol.sizeMod.Size
import typings.ol.tilecoordMod.TileCoord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TileSource
  extends typings.ol.sourceSourceMod.default {
  
  def canExpireCache(): Boolean = js.native
  
  /**
    * Remove all cached tiles from the source. The next render cycle will fetch new tiles.
    */
  def clear(): Unit = js.native
  
  def expireCache(projection: typings.ol.projectionMod.default, usedTiles: StringDictionary[Boolean]): Unit = js.native
  
  def forEachLoadedTile(
    projection: typings.ol.projectionMod.default,
    z: Double,
    tileRange: typings.ol.tileRangeMod.default,
    callback: js.Function1[/* p0 */ typings.ol.olTileMod.default, Boolean]
  ): Boolean = js.native
  
  def getGutterForProjection(projection: typings.ol.projectionMod.default): Double = js.native
  
  /**
    * Return the key to be used for all tiles in the source.
    */
  /* protected */ def getKey(): String = js.native
  
  def getOpaque(projection: typings.ol.projectionMod.default): Boolean = js.native
  
  def getTile(z: Double, x: Double, y: Double, pixelRatio: Double, projection: typings.ol.projectionMod.default): typings.ol.olTileMod.default = js.native
  
  /* protected */ def getTileCacheForProjection(projection: typings.ol.projectionMod.default): typings.ol.tileCacheMod.default = js.native
  
  /**
    * Returns a tile coordinate wrapped around the x-axis. When the tile coordinate
    * is outside the resolution and extent range of the tile grid, null will be
    * returned.
    */
  def getTileCoordForTileUrlFunction(tileCoord: TileCoord): TileCoord = js.native
  def getTileCoordForTileUrlFunction(tileCoord: TileCoord, opt_projection: typings.ol.projectionMod.default): TileCoord = js.native
  
  /**
    * Return the tile grid of the tile source.
    */
  def getTileGrid(): typings.ol.tilegridTileGridMod.default = js.native
  
  def getTileGridForProjection(projection: typings.ol.projectionMod.default): typings.ol.tilegridTileGridMod.default = js.native
  
  /**
    * Get the tile pixel ratio for this source. Subclasses may override this
    * method, which is meant to return a supported pixel ratio that matches the
    * provided pixelRatio as close as possible.
    */
  def getTilePixelRatio(pixelRatio: Double): Double = js.native
  
  def getTilePixelSize(z: Double, pixelRatio: Double, projection: typings.ol.projectionMod.default): Size = js.native
  
  /**
    * Set the value to be used as the key for all tiles in the source.
    */
  /* protected */ def setKey(key: String): Unit = js.native
  
  var tileCache: typings.ol.tileCacheMod.default = js.native
  
  var tileGrid: typings.ol.tilegridTileGridMod.default = js.native
  
  var tileOptions: typings.ol.olTileMod.Options = js.native
  
  var tmpSize: Size = js.native
  
  /**
    * Increases the cache size if needed
    */
  def updateCacheSize(tileCount: Double, projection: typings.ol.projectionMod.default): Unit = js.native
  
  /**
    * Marks a tile coord as being used, without triggering a load.
    */
  def useTile(z: Double, x: Double, y: Double, projection: typings.ol.projectionMod.default): Unit = js.native
}
