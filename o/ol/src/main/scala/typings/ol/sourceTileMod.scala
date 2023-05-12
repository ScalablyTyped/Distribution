package typings.ol

import org.scalablytyped.runtime.StringDictionary
import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.eventsMod.EventsKey
import typings.ol.objectEventTypeMod.Types
import typings.ol.objectMod.ObjectEvent
import typings.ol.observableMod.EventTypes
import typings.ol.observableMod.OnSignature
import typings.ol.projMod.ProjectionLike
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceSourceMod.State
import typings.ol.sourceTileEventTypeMod.TileSourceEventTypes
import typings.ol.tilecoordMod.TileCoord
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceTileMod {
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<import("./TileEventType").TileSourceEventTypes, TileSourceEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     import("./TileEventType").TileSourceEventTypes, Return>} TileSourceOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] CacheSize.
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {number} [tilePixelRatio] TilePixelRatio.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection.
    * @property {import("./Source.js").State} [state] State.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] TileGrid.
    * @property {boolean} [wrapX=false] WrapX.
    * @property {number} [transition] Transition.
    * @property {string} [key] Key.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0] ZDirection.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for sources providing images divided into a tile grid.
    * @abstract
    * @api
    */
  @JSImport("ol/source/Tile", JSImport.Default)
  @js.native
  open class default protected () extends TileSource {
    /**
      * @param {Options} options SourceTile source options.
      */
    def this(options: Options) = this()
  }
  
  @JSImport("ol/source/Tile", "TileSourceEvent")
  @js.native
  open class TileSourceEvent protected ()
    extends typings.ol.eventsEventMod.default {
    /**
      * @param {string} type Type.
      * @param {import("../Tile.js").default} tile The tile.
      */
    def this(`type`: String, tile: typings.ol.tileMod.default) = this()
    
    /**
      * The tile related to the event.
      * @type {import("../Tile.js").default}
      * @api
      */
    var tile: typings.ol.tileMod.default = js.native
  }
  
  trait Options extends StObject {
    
    /**
      * Attributions.
      */
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    /**
      * Attributions are collapsible.
      */
    var attributionsCollapsible: js.UndefOr[Boolean] = js.undefined
    
    /**
      * CacheSize.
      */
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * Use interpolated values when resampling.  By default,
      * the nearest neighbor is used when resampling.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Key.
      */
    var key: js.UndefOr[String] = js.undefined
    
    /**
      * Whether the layer is opaque.
      */
    var opaque: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Projection.
      */
    var projection: js.UndefOr[ProjectionLike] = js.undefined
    
    /**
      * State.
      */
    var state: js.UndefOr[State] = js.undefined
    
    /**
      * TileGrid.
      */
    var tileGrid: js.UndefOr[typings.ol.tilegridTileGridMod.default] = js.undefined
    
    /**
      * TilePixelRatio.
      */
    var tilePixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * Transition.
      */
    var transition: js.UndefOr[Double] = js.undefined
    
    /**
      * WrapX.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * ZDirection.
      */
    var zDirection: js.UndefOr[Double | NearestDirectionFunction] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setAttributions(value: AttributionLike): Self = StObject.set(x, "attributions", value.asInstanceOf[js.Any])
      
      inline def setAttributionsCollapsible(value: Boolean): Self = StObject.set(x, "attributionsCollapsible", value.asInstanceOf[js.Any])
      
      inline def setAttributionsCollapsibleUndefined: Self = StObject.set(x, "attributionsCollapsible", js.undefined)
      
      inline def setAttributionsFunction1(value: /* arg0 */ ViewStateAndExtent => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
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
      
      inline def setZDirection(value: Double | NearestDirectionFunction): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionFunction3(value: (/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double) => Double): Self = StObject.set(x, "zDirection", js.Any.fromFunction3(value))
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
  /***
    * @template Return
    * @typedef {import("../Observable").OnSignature<import("../Observable").EventTypes, import("../events/Event.js").default, Return> &
    *   import("../Observable").OnSignature<import("../ObjectEventType").Types, import("../Object").ObjectEvent, Return> &
    *   import("../Observable").OnSignature<import("./TileEventType").TileSourceEventTypes, TileSourceEvent, Return> &
    *   import("../Observable").CombinedOnSignature<import("../Observable").EventTypes|import("../ObjectEventType").Types|
    *     import("./TileEventType").TileSourceEventTypes, Return>} TileSourceOnSignature
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] CacheSize.
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {number} [tilePixelRatio] TilePixelRatio.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection.
    * @property {import("./Source.js").State} [state] State.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] TileGrid.
    * @property {boolean} [wrapX=false] WrapX.
    * @property {number} [transition] Transition.
    * @property {string} [key] Key.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0] ZDirection.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    */
  /**
    * @classdesc
    * Abstract base class; normally only used for creating subclasses and not
    * instantiated in apps.
    * Base class for sources providing images divided into a tile grid.
    * @abstract
    * @api
    */
  @js.native
  trait TileSource
    extends typings.ol.sourceSourceMod.default {
    
    /**
      * @return {boolean} Can expire cache.
      */
    def canExpireCache(): Boolean = js.native
    
    /**
      * Remove all cached tiles from the source. The next render cycle will fetch new tiles.
      * @api
      */
    def clear(): Unit = js.native
    
    /**
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @param {!Object<string, boolean>} usedTiles Used tiles.
      */
    def expireCache(projection: typings.ol.projProjectionMod.default, usedTiles: StringDictionary[Boolean]): Unit = js.native
    
    /**
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @param {number} z Zoom level.
      * @param {import("../TileRange.js").default} tileRange Tile range.
      * @param {function(import("../Tile.js").default):(boolean|void)} callback Called with each
      *     loaded tile.  If the callback returns `false`, the tile will not be
      *     considered loaded.
      * @return {boolean} The tile range is fully covered with loaded tiles.
      */
    def forEachLoadedTile(
      projection: typings.ol.projProjectionMod.default,
      z: Double,
      tileRange: typings.ol.tileRangeMod.default,
      callback: js.Function1[/* arg0 */ typings.ol.tileMod.default, Boolean | Unit]
    ): Boolean = js.native
    
    /**
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @return {number} Gutter.
      */
    def getGutterForProjection(projection: typings.ol.projProjectionMod.default): Double = js.native
    
    /**
      * Return the key to be used for all tiles in the source.
      * @return {string} The key for all tiles.
      */
    def getKey(): String = js.native
    
    /**
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @return {boolean} Opaque.
      */
    def getOpaque(projection: typings.ol.projProjectionMod.default): Boolean = js.native
    
    /**
      * @abstract
      * @param {number} z Tile coordinate z.
      * @param {number} x Tile coordinate x.
      * @param {number} y Tile coordinate y.
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @return {!import("../Tile.js").default} Tile.
      */
    def getTile(
      z: Double,
      x: Double,
      y: Double,
      pixelRatio: Double,
      projection: typings.ol.projProjectionMod.default
    ): typings.ol.tileMod.default = js.native
    
    /**
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @return {import("../TileCache.js").default} Tile cache.
      * @protected
      */
    /* protected */ def getTileCacheForProjection(projection: typings.ol.projProjectionMod.default): typings.ol.tileCacheMod.default = js.native
    
    /**
      * Returns a tile coordinate wrapped around the x-axis. When the tile coordinate
      * is outside the resolution and extent range of the tile grid, `null` will be
      * returned.
      * @param {import("../tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {import("../proj/Projection.js").default} [projection] Projection.
      * @return {import("../tilecoord.js").TileCoord} Tile coordinate to be passed to the tileUrlFunction or
      *     null if no tile URL should be created for the passed `tileCoord`.
      */
    def getTileCoordForTileUrlFunction(tileCoord: TileCoord): TileCoord = js.native
    def getTileCoordForTileUrlFunction(tileCoord: TileCoord, projection: typings.ol.projProjectionMod.default): TileCoord = js.native
    
    /**
      * Return the tile grid of the tile source.
      * @return {import("../tilegrid/TileGrid.js").default|null} Tile grid.
      * @api
      */
    def getTileGrid(): typings.ol.tilegridTileGridMod.default | Null = js.native
    
    /**
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @return {!import("../tilegrid/TileGrid.js").default} Tile grid.
      */
    def getTileGridForProjection(projection: typings.ol.projProjectionMod.default): typings.ol.tilegridTileGridMod.default = js.native
    
    /**
      * Get the tile pixel ratio for this source. Subclasses may override this
      * method, which is meant to return a supported pixel ratio that matches the
      * provided `pixelRatio` as close as possible.
      * @param {number} pixelRatio Pixel ratio.
      * @return {number} Tile pixel ratio.
      */
    def getTilePixelRatio(pixelRatio: Double): Double = js.native
    
    /**
      * @param {number} z Z.
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @return {import("../size.js").Size} Tile size.
      */
    def getTilePixelSize(z: Double, pixelRatio: Double, projection: typings.ol.projProjectionMod.default): Size = js.native
    
    /**
      * @private
      * @type {string}
      */
    /* private */ var key_ : Any = js.native
    
    /***
      * @type {TileSourceOnSignature<import("../events").EventsKey>}
      */
    @JSName("on")
    var on_TileSource: TileSourceOnSignature[EventsKey] = js.native
    
    /***
      * @type {TileSourceOnSignature<import("../events").EventsKey>}
      */
    @JSName("once")
    var once_TileSource: TileSourceOnSignature[EventsKey] = js.native
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var opaque_ : Any = js.native
    
    /**
      * Set the value to be used as the key for all tiles in the source.
      * @param {string} key The key for tiles.
      * @protected
      */
    /* protected */ def setKey(key: String): Unit = js.native
    
    /**
      * @protected
      * @type {import("../TileCache.js").default}
      */
    /* protected */ var tileCache: typings.ol.tileCacheMod.default = js.native
    
    /**
      * @type {import("../tilegrid/TileGrid.js").default|null}
      */
    var tileGrid: typings.ol.tilegridTileGridMod.default | Null = js.native
    
    /**
      * @protected
      * @type {import("../Tile.js").Options}
      */
    /* protected */ var tileOptions: typings.ol.tileMod.Options = js.native
    
    /**
      * @private
      * @type {number}
      */
    /* private */ var tilePixelRatio_ : Any = js.native
    
    /**
      * @protected
      * @type {import("../size.js").Size}
      */
    /* protected */ var tmpSize: Size = js.native
    
    /***
      * @type {TileSourceOnSignature<void>}
      */
    @JSName("un")
    var un_TileSource: TileSourceOnSignature[Unit] = js.native
    
    /**
      * Increases the cache size if needed
      * @param {number} tileCount Minimum number of tiles needed.
      * @param {import("../proj/Projection.js").default} projection Projection.
      */
    def updateCacheSize(tileCount: Double, projection: typings.ol.projProjectionMod.default): Unit = js.native
    
    /**
      * Marks a tile coord as being used, without triggering a load.
      * @abstract
      * @param {number} z Tile coordinate z.
      * @param {number} x Tile coordinate x.
      * @param {number} y Tile coordinate y.
      * @param {import("../proj/Projection.js").default} projection Projection.
      */
    def useTile(z: Double, x: Double, y: Double, projection: typings.ol.projProjectionMod.default): Unit = js.native
    
    /**
      * zDirection hint, read by the renderer. Indicates which resolution should be used
      * by a renderer if the views resolution does not match any resolution of the tile source.
      * If 0, the nearest resolution will be used. If 1, the nearest lower resolution
      * will be used. If -1, the nearest higher resolution will be used.
      * @type {number|import("../array.js").NearestDirectionFunction}
      */
    var zDirection: Double | NearestDirectionFunction = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.ol.observableMod.CombinedOnSignature because Already inherited */ @js.native
  trait TileSourceOnSignature[Return]
    extends OnSignature[
          EventTypes | TileSourceEventTypes | Types, 
          ObjectEvent | TileSourceEvent | typings.ol.eventsEventMod.default, 
          Return
        ]
}
