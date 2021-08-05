package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.pluggableMapMod.FrameState
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.stateMod.State
import typings.ol.tilecoordMod.TileCoord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceTileMod {
  
  @JSImport("ol/source/Tile", JSImport.Default)
  @js.native
  abstract class default protected () extends TileSource {
    def this(options: Options) = this()
  }
  
  @JSImport("ol/source/Tile", "TileSourceEvent")
  @js.native
  class TileSourceEvent protected ()
    extends typings.ol.eventMod.default {
    def this(`type`: String, tile: typings.ol.olTileMod.default) = this()
    
    /**
      * The tile related to the event.
      */
    var tile: typings.ol.olTileMod.default = js.native
  }
  
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    var attributionsCollapsible: js.UndefOr[Boolean] = js.undefined
    
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    var key: js.UndefOr[String] = js.undefined
    
    var opaque: js.UndefOr[Boolean] = js.undefined
    
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    var state: js.UndefOr[State] = js.undefined
    
    var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.undefined
    
    var tilePixelRatio: js.UndefOr[Double] = js.undefined
    
    var transition: js.UndefOr[Double] = js.undefined
    
    var wrapX: js.UndefOr[Boolean] = js.undefined
    
    var zDirection: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsCollapsible(value: Boolean): Self = StObject.set(x, "attributionsCollapsible", value.asInstanceOf[js.Any])
      
      inline def setAttributionsCollapsibleUndefined: Self = StObject.set(x, "attributionsCollapsible", js.undefined)
      
      inline def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value :_*))
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      inline def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      inline def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      inline def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      inline def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      inline def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
      
      inline def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
      
      inline def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      inline def setZDirection(value: Double): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
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
    
    /* protected */ var tileCache: typings.ol.tileCacheMod.default = js.native
    
    /* protected */ var tileGrid: typings.ol.tilegridTileGridMod.default = js.native
    
    /* protected */ var tileOptions: typings.ol.olTileMod.Options = js.native
    
    /* protected */ var tmpSize: Size = js.native
    
    /**
      * Increases the cache size if needed
      */
    def updateCacheSize(tileCount: Double, projection: typings.ol.projectionMod.default): Unit = js.native
    
    /**
      * Marks a tile coord as being used, without triggering a load.
      */
    def useTile(z: Double, x: Double, y: Double, projection: typings.ol.projectionMod.default): Unit = js.native
  }
}
