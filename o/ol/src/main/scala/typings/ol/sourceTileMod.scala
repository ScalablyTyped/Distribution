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
import scala.scalajs.js.`|`
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
  
  @js.native
  trait Options extends StObject {
    
    var attributions: js.UndefOr[AttributionLike] = js.native
    
    var attributionsCollapsible: js.UndefOr[Boolean] = js.native
    
    var cacheSize: js.UndefOr[Double] = js.native
    
    var key: js.UndefOr[String] = js.native
    
    var opaque: js.UndefOr[Boolean] = js.native
    
    var projection: js.UndefOr[ProjectionLike] = js.native
    
    var state: js.UndefOr[State] = js.native
    
    var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.native
    
    var tilePixelRatio: js.UndefOr[Double] = js.native
    
    var transition: js.UndefOr[Double] = js.native
    
    var wrapX: js.UndefOr[Boolean] = js.native
    
    var zDirection: js.UndefOr[Double] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionsCollapsible(value: Boolean): Self = StObject.set(x, "attributionsCollapsible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributionsCollapsibleUndefined: Self = StObject.set(x, "attributionsCollapsible", js.undefined)
      
      @scala.inline
      def setAttributionsFunction1(value: /* p0 */ FrameState => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      @scala.inline
      def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value :_*))
      
      @scala.inline
      def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setOpaque(value: Boolean): Self = StObject.set(x, "opaque", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpaqueUndefined: Self = StObject.set(x, "opaque", js.undefined)
      
      @scala.inline
      def setProjection(value: ProjectionLike): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setTileGrid(value: typings.ol.tilegridTileGridMod.default): Self = StObject.set(x, "tileGrid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTileGridUndefined: Self = StObject.set(x, "tileGrid", js.undefined)
      
      @scala.inline
      def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
      
      @scala.inline
      def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      @scala.inline
      def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      @scala.inline
      def setZDirection(value: Double): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
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
}
