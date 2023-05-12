package typings.ol

import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.projMod.ProjectionLike
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.sourceSourceMod.State
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import typings.ol.tileMod.UrlFunction
import typings.ol.tilecoordMod.TileCoord
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceUrlTileMod {
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] Cache size.
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection.
    * @property {import("./Source.js").State} [state] State.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] TileGrid.
    * @property {import("../Tile.js").LoadFunction} tileLoadFunction TileLoadFunction.
    * @property {number} [tilePixelRatio] TilePixelRatio.
    * @property {import("../Tile.js").UrlFunction} [tileUrlFunction] TileUrlFunction.
    * @property {string} [url] Url.
    * @property {Array<string>} [urls] Urls.
    * @property {boolean} [wrapX=true] WrapX.
    * @property {number} [transition] Transition.
    * @property {string} [key] Key.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0] ZDirection.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    */
  /**
    * @classdesc
    * Base class for sources providing tiles divided into a tile grid over http.
    *
    * @fires import("./Tile.js").TileSourceEvent
    */
  @JSImport("ol/source/UrlTile", JSImport.Default)
  @js.native
  open class default protected () extends UrlTile {
    /**
      * @param {Options} options Image tile options.
      */
    def this(options: Options) = this()
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
      * Cache size.
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
      * TileLoadFunction.
      */
    def tileLoadFunction(arg0: Tile, arg1: String): Unit
    /**
      * TileLoadFunction.
      */
    @JSName("tileLoadFunction")
    var tileLoadFunction_Original: LoadFunction
    
    /**
      * TilePixelRatio.
      */
    var tilePixelRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * TileUrlFunction.
      */
    var tileUrlFunction: js.UndefOr[UrlFunction] = js.undefined
    
    /**
      * Transition.
      */
    var transition: js.UndefOr[Double] = js.undefined
    
    /**
      * Url.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * Urls.
      */
    var urls: js.UndefOr[js.Array[String]] = js.undefined
    
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
    
    inline def apply(tileLoadFunction: (/* arg0 */ Tile, /* arg1 */ String) => Unit): Options = {
      val __obj = js.Dynamic.literal(tileLoadFunction = js.Any.fromFunction2(tileLoadFunction))
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
      
      inline def setTileLoadFunction(value: (/* arg0 */ Tile, /* arg1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      inline def setTilePixelRatio(value: Double): Self = StObject.set(x, "tilePixelRatio", value.asInstanceOf[js.Any])
      
      inline def setTilePixelRatioUndefined: Self = StObject.set(x, "tilePixelRatio", js.undefined)
      
      inline def setTileUrlFunction(
        value: (/* arg0 */ TileCoord, /* arg1 */ Double, /* arg2 */ typings.ol.projProjectionMod.default) => js.UndefOr[String]
      ): Self = StObject.set(x, "tileUrlFunction", js.Any.fromFunction3(value))
      
      inline def setTileUrlFunctionUndefined: Self = StObject.set(x, "tileUrlFunction", js.undefined)
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setUrls(value: js.Array[String]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsUndefined: Self = StObject.set(x, "urls", js.undefined)
      
      inline def setUrlsVarargs(value: String*): Self = StObject.set(x, "urls", js.Array(value*))
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      inline def setZDirection(value: Double | NearestDirectionFunction): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionFunction3(value: (/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double) => Double): Self = StObject.set(x, "zDirection", js.Any.fromFunction3(value))
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {boolean} [attributionsCollapsible=true] Attributions are collapsible.
    * @property {number} [cacheSize] Cache size.
    * @property {boolean} [opaque=false] Whether the layer is opaque.
    * @property {import("../proj.js").ProjectionLike} [projection] Projection.
    * @property {import("./Source.js").State} [state] State.
    * @property {import("../tilegrid/TileGrid.js").default} [tileGrid] TileGrid.
    * @property {import("../Tile.js").LoadFunction} tileLoadFunction TileLoadFunction.
    * @property {number} [tilePixelRatio] TilePixelRatio.
    * @property {import("../Tile.js").UrlFunction} [tileUrlFunction] TileUrlFunction.
    * @property {string} [url] Url.
    * @property {Array<string>} [urls] Urls.
    * @property {boolean} [wrapX=true] WrapX.
    * @property {number} [transition] Transition.
    * @property {string} [key] Key.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0] ZDirection.
    * @property {boolean} [interpolate=false] Use interpolated values when resampling.  By default,
    * the nearest neighbor is used when resampling.
    */
  /**
    * @classdesc
    * Base class for sources providing tiles divided into a tile grid over http.
    *
    * @fires import("./Tile.js").TileSourceEvent
    */
  @js.native
  trait UrlTile
    extends typings.ol.sourceTileMod.default {
    
    /**
      * @private
      * @type {boolean}
      */
    /* private */ var generateTileUrlFunction_ : Any = js.native
    
    /**
      * Return the tile load function of the source.
      * @return {import("../Tile.js").LoadFunction} TileLoadFunction
      * @api
      */
    def getTileLoadFunction(): LoadFunction = js.native
    
    /**
      * Return the tile URL function of the source.
      * @return {import("../Tile.js").UrlFunction} TileUrlFunction
      * @api
      */
    def getTileUrlFunction(): UrlFunction = js.native
    
    /**
      * Return the URLs used for this source.
      * When a tileUrlFunction is used instead of url or urls,
      * null will be returned.
      * @return {!Array<string>|null} URLs.
      * @api
      */
    def getUrls(): js.Array[String] | Null = js.native
    
    /**
      * Handle tile change events.
      * @param {import("../events/Event.js").default} event Event.
      * @protected
      */
    /* protected */ def handleTileChange(event: typings.ol.eventsEventMod.default): Unit = js.native
    
    /**
      * Set the tile load function of the source.
      * @param {import("../Tile.js").LoadFunction} tileLoadFunction Tile load function.
      * @api
      */
    def setTileLoadFunction(tileLoadFunction: LoadFunction): Unit = js.native
    
    /**
      * Set the tile URL function of the source.
      * @param {import("../Tile.js").UrlFunction} tileUrlFunction Tile URL function.
      * @param {string} [key] Optional new tile key for the source.
      * @api
      */
    def setTileUrlFunction(tileUrlFunction: UrlFunction): Unit = js.native
    def setTileUrlFunction(tileUrlFunction: UrlFunction, key: String): Unit = js.native
    
    /**
      * Set the URL to use for requests.
      * @param {string} url URL.
      * @api
      */
    def setUrl(url: String): Unit = js.native
    
    /**
      * Set the URLs to use for requests.
      * @param {Array<string>} urls URLs.
      * @api
      */
    def setUrls(urls: js.Array[String]): Unit = js.native
    
    /**
      * @protected
      * @type {import("../Tile.js").LoadFunction}
      */
    /* protected */ def tileLoadFunction(arg0: Tile, arg1: String): Unit = js.native
    /**
      * @protected
      * @type {import("../Tile.js").LoadFunction}
      */
    /* protected */ @JSName("tileLoadFunction")
    var tileLoadFunction_Original: LoadFunction = js.native
    
    /**
      * @private
      * @type {!Object<string, boolean>}
      */
    /* private */ var tileLoadingKeys_ : Any = js.native
    
    /**
      * @param {import("../tilecoord.js").TileCoord} tileCoord Tile coordinate.
      * @param {number} pixelRatio Pixel ratio.
      * @param {import("../proj/Projection.js").default} projection Projection.
      * @return {string|undefined} Tile URL.
      */
    def tileUrlFunction(tileCoord: TileCoord, pixelRatio: Double, projection: typings.ol.projProjectionMod.default): js.UndefOr[String] = js.native
    
    /**
      * @protected
      * @type {!Array<string>|null}
      */
    /* protected */ var urls: js.Array[String] | Null = js.native
    
    /**
      * Marks a tile coord as being used, without triggering a load.
      * @param {number} z Tile coordinate z.
      * @param {number} x Tile coordinate x.
      * @param {number} y Tile coordinate y.
      */
    def useTile(z: Double, x: Double, y: Double): Unit = js.native
  }
}
