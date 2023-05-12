package typings.ol

import typings.ol.arrayMod.NearestDirectionFunction
import typings.ol.sizeMod.Size
import typings.ol.sourceSourceMod.AttributionLike
import typings.ol.tileMod.LoadFunction
import typings.ol.tileMod.Tile
import typings.ol.viewMod.ViewStateAndExtent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sourceTileJSONMod {
  
  /**
    * @typedef {Object} Config
    * @property {string} [name] The name.
    * @property {string} [description] The description.
    * @property {string} [version] The version.
    * @property {string} [attribution] The attribution.
    * @property {string} [template] The template.
    * @property {string} [legend] The legend.
    * @property {string} [scheme] The scheme.
    * @property {Array<string>} tiles The tile URL templates.
    * @property {Array<string>} [grids] Optional grids.
    * @property {number} [minzoom] Minimum zoom level.
    * @property {number} [maxzoom] Maximum zoom level.
    * @property {Array<number>} [bounds] Optional bounds.
    * @property {Array<number>} [center] Optional center.
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {boolean} [jsonp=false] Use JSONP with callback to load the TileJSON.
    * Useful when the server does not support CORS..
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {Config} [tileJSON] TileJSON configuration for this source.
    * If not provided, `url` must be configured.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {number|import("../size.js").Size} [tileSize=[256, 256]] The tile size used by the tile service.
    * Note: `tileSize` and other non-standard TileJSON properties are currently ignored.
    * @property {string} [url] URL to the TileJSON file. If not provided, `tileJSON` must be configured.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data in TileJSON format.
    * @api
    */
  @JSImport("ol/source/TileJSON", JSImport.Default)
  @js.native
  open class default protected () extends TileJSON {
    /**
      * @param {Options} options TileJSON options.
      */
    def this(options: Options) = this()
  }
  
  trait Config extends StObject {
    
    /**
      * The attribution.
      */
    var attribution: js.UndefOr[String] = js.undefined
    
    /**
      * Optional bounds.
      */
    var bounds: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Optional center.
      */
    var center: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * The description.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Optional grids.
      */
    var grids: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * The legend.
      */
    var legend: js.UndefOr[String] = js.undefined
    
    /**
      * Maximum zoom level.
      */
    var maxzoom: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum zoom level.
      */
    var minzoom: js.UndefOr[Double] = js.undefined
    
    /**
      * The name.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The scheme.
      */
    var scheme: js.UndefOr[String] = js.undefined
    
    /**
      * The template.
      */
    var template: js.UndefOr[String] = js.undefined
    
    /**
      * The tile URL templates.
      */
    var tiles: js.Array[String]
    
    /**
      * The version.
      */
    var version: js.UndefOr[String] = js.undefined
  }
  object Config {
    
    inline def apply(tiles: js.Array[String]): Config = {
      val __obj = js.Dynamic.literal(tiles = tiles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Config] (val x: Self) extends AnyVal {
      
      inline def setAttribution(value: String): Self = StObject.set(x, "attribution", value.asInstanceOf[js.Any])
      
      inline def setAttributionUndefined: Self = StObject.set(x, "attribution", js.undefined)
      
      inline def setBounds(value: js.Array[Double]): Self = StObject.set(x, "bounds", value.asInstanceOf[js.Any])
      
      inline def setBoundsUndefined: Self = StObject.set(x, "bounds", js.undefined)
      
      inline def setBoundsVarargs(value: Double*): Self = StObject.set(x, "bounds", js.Array(value*))
      
      inline def setCenter(value: js.Array[Double]): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      inline def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      inline def setCenterVarargs(value: Double*): Self = StObject.set(x, "center", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setGrids(value: js.Array[String]): Self = StObject.set(x, "grids", value.asInstanceOf[js.Any])
      
      inline def setGridsUndefined: Self = StObject.set(x, "grids", js.undefined)
      
      inline def setGridsVarargs(value: String*): Self = StObject.set(x, "grids", js.Array(value*))
      
      inline def setLegend(value: String): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      inline def setMaxzoom(value: Double): Self = StObject.set(x, "maxzoom", value.asInstanceOf[js.Any])
      
      inline def setMaxzoomUndefined: Self = StObject.set(x, "maxzoom", js.undefined)
      
      inline def setMinzoom(value: Double): Self = StObject.set(x, "minzoom", value.asInstanceOf[js.Any])
      
      inline def setMinzoomUndefined: Self = StObject.set(x, "minzoom", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setScheme(value: String): Self = StObject.set(x, "scheme", value.asInstanceOf[js.Any])
      
      inline def setSchemeUndefined: Self = StObject.set(x, "scheme", js.undefined)
      
      inline def setTemplate(value: String): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
      
      inline def setTemplateUndefined: Self = StObject.set(x, "template", js.undefined)
      
      inline def setTiles(value: js.Array[String]): Self = StObject.set(x, "tiles", value.asInstanceOf[js.Any])
      
      inline def setTilesVarargs(value: String*): Self = StObject.set(x, "tiles", js.Array(value*))
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Options extends StObject {
    
    /**
      * Attributions.
      */
    var attributions: js.UndefOr[AttributionLike] = js.undefined
    
    /**
      * Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
      */
    var cacheSize: js.UndefOr[Double] = js.undefined
    
    /**
      * The `crossOrigin` attribute for loaded images.  Note that
      * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
      * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
      */
    var crossOrigin: js.UndefOr[String | Null] = js.undefined
    
    /**
      * Use interpolated values when resampling.  By default,
      * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
      */
    var interpolate: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Use JSONP with callback to load the TileJSON.
      * Useful when the server does not support CORS..
      */
    var jsonp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Maximum allowed reprojection error (in pixels).
      * Higher values can increase reprojection performance, but decrease precision.
      */
    var reprojectionErrorThreshold: js.UndefOr[Double] = js.undefined
    
    /**
      * TileJSON configuration for this source.
      * If not provided, `url` must be configured.
      */
    var tileJSON: js.UndefOr[Config] = js.undefined
    
    /**
      * Optional function to load a tile given a URL. The default is
      * ```js
      * function(imageTile, src) {
      * imageTile.getImage().src = src;
      * };
      * ```
      */
    var tileLoadFunction: js.UndefOr[LoadFunction] = js.undefined
    
    /**
      * The tile size used by the tile service.
      * Note: `tileSize` and other non-standard TileJSON properties are currently ignored.
      */
    var tileSize: js.UndefOr[Double | Size] = js.undefined
    
    /**
      * Duration of the opacity transition for rendering.
      * To disable the opacity transition, pass `transition: 0`.
      */
    var transition: js.UndefOr[Double] = js.undefined
    
    /**
      * URL to the TileJSON file. If not provided, `tileJSON` must be configured.
      */
    var url: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to wrap the world horizontally.
      */
    var wrapX: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Choose whether to use tiles with a higher or lower zoom level when between integer
      * zoom levels. See {@link module :ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
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
      
      inline def setAttributionsFunction1(value: /* arg0 */ ViewStateAndExtent => String | js.Array[String]): Self = StObject.set(x, "attributions", js.Any.fromFunction1(value))
      
      inline def setAttributionsUndefined: Self = StObject.set(x, "attributions", js.undefined)
      
      inline def setAttributionsVarargs(value: String*): Self = StObject.set(x, "attributions", js.Array(value*))
      
      inline def setCacheSize(value: Double): Self = StObject.set(x, "cacheSize", value.asInstanceOf[js.Any])
      
      inline def setCacheSizeUndefined: Self = StObject.set(x, "cacheSize", js.undefined)
      
      inline def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      inline def setCrossOriginNull: Self = StObject.set(x, "crossOrigin", null)
      
      inline def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      inline def setInterpolate(value: Boolean): Self = StObject.set(x, "interpolate", value.asInstanceOf[js.Any])
      
      inline def setInterpolateUndefined: Self = StObject.set(x, "interpolate", js.undefined)
      
      inline def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
      
      inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
      
      inline def setReprojectionErrorThreshold(value: Double): Self = StObject.set(x, "reprojectionErrorThreshold", value.asInstanceOf[js.Any])
      
      inline def setReprojectionErrorThresholdUndefined: Self = StObject.set(x, "reprojectionErrorThreshold", js.undefined)
      
      inline def setTileJSON(value: Config): Self = StObject.set(x, "tileJSON", value.asInstanceOf[js.Any])
      
      inline def setTileJSONUndefined: Self = StObject.set(x, "tileJSON", js.undefined)
      
      inline def setTileLoadFunction(value: (/* arg0 */ Tile, /* arg1 */ String) => Unit): Self = StObject.set(x, "tileLoadFunction", js.Any.fromFunction2(value))
      
      inline def setTileLoadFunctionUndefined: Self = StObject.set(x, "tileLoadFunction", js.undefined)
      
      inline def setTileSize(value: Double | Size): Self = StObject.set(x, "tileSize", value.asInstanceOf[js.Any])
      
      inline def setTileSizeUndefined: Self = StObject.set(x, "tileSize", js.undefined)
      
      inline def setTileSizeVarargs(value: Double*): Self = StObject.set(x, "tileSize", js.Array(value*))
      
      inline def setTransition(value: Double): Self = StObject.set(x, "transition", value.asInstanceOf[js.Any])
      
      inline def setTransitionUndefined: Self = StObject.set(x, "transition", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      inline def setWrapX(value: Boolean): Self = StObject.set(x, "wrapX", value.asInstanceOf[js.Any])
      
      inline def setWrapXUndefined: Self = StObject.set(x, "wrapX", js.undefined)
      
      inline def setZDirection(value: Double | NearestDirectionFunction): Self = StObject.set(x, "zDirection", value.asInstanceOf[js.Any])
      
      inline def setZDirectionFunction3(value: (/* arg0 */ Double, /* arg1 */ Double, /* arg2 */ Double) => Double): Self = StObject.set(x, "zDirection", js.Any.fromFunction3(value))
      
      inline def setZDirectionUndefined: Self = StObject.set(x, "zDirection", js.undefined)
    }
  }
  
  /**
    * @typedef {Object} Config
    * @property {string} [name] The name.
    * @property {string} [description] The description.
    * @property {string} [version] The version.
    * @property {string} [attribution] The attribution.
    * @property {string} [template] The template.
    * @property {string} [legend] The legend.
    * @property {string} [scheme] The scheme.
    * @property {Array<string>} tiles The tile URL templates.
    * @property {Array<string>} [grids] Optional grids.
    * @property {number} [minzoom] Minimum zoom level.
    * @property {number} [maxzoom] Maximum zoom level.
    * @property {Array<number>} [bounds] Optional bounds.
    * @property {Array<number>} [center] Optional center.
    */
  /**
    * @typedef {Object} Options
    * @property {import("./Source.js").AttributionLike} [attributions] Attributions.
    * @property {number} [cacheSize] Initial tile cache size. Will auto-grow to hold at least the number of tiles in the viewport.
    * @property {null|string} [crossOrigin] The `crossOrigin` attribute for loaded images.  Note that
    * you must provide a `crossOrigin` value if you want to access pixel data with the Canvas renderer.
    * See https://developer.mozilla.org/en-US/docs/Web/HTML/CORS_enabled_image for more detail.
    * @property {boolean} [interpolate=true] Use interpolated values when resampling.  By default,
    * linear interpolation is used when resampling.  Set to false to use the nearest neighbor instead.
    * @property {boolean} [jsonp=false] Use JSONP with callback to load the TileJSON.
    * Useful when the server does not support CORS..
    * @property {number} [reprojectionErrorThreshold=0.5] Maximum allowed reprojection error (in pixels).
    * Higher values can increase reprojection performance, but decrease precision.
    * @property {Config} [tileJSON] TileJSON configuration for this source.
    * If not provided, `url` must be configured.
    * @property {import("../Tile.js").LoadFunction} [tileLoadFunction] Optional function to load a tile given a URL. The default is
    * ```js
    * function(imageTile, src) {
    *   imageTile.getImage().src = src;
    * };
    * ```
    * @property {number|import("../size.js").Size} [tileSize=[256, 256]] The tile size used by the tile service.
    * Note: `tileSize` and other non-standard TileJSON properties are currently ignored.
    * @property {string} [url] URL to the TileJSON file. If not provided, `tileJSON` must be configured.
    * @property {boolean} [wrapX=true] Whether to wrap the world horizontally.
    * @property {number} [transition] Duration of the opacity transition for rendering.
    * To disable the opacity transition, pass `transition: 0`.
    * @property {number|import("../array.js").NearestDirectionFunction} [zDirection=0]
    * Choose whether to use tiles with a higher or lower zoom level when between integer
    * zoom levels. See {@link module:ol/tilegrid/TileGrid~TileGrid#getZForResolution}.
    */
  /**
    * @classdesc
    * Layer source for tile data in TileJSON format.
    * @api
    */
  @js.native
  trait TileJSON
    extends typings.ol.sourceTileImageMod.default {
    
    /**
      * @return {Config} The tilejson object.
      * @api
      */
    def getTileJSON(): Config = js.native
    
    /**
      * @protected
      */
    /* protected */ def handleTileJSONError(): Unit = js.native
    
    /**
      * @protected
      * @param {Config} tileJSON Tile JSON.
      */
    /* protected */ def handleTileJSONResponse(tileJSON: Config): Unit = js.native
    
    /**
      * @private
      * @param {Event} event The error event.
      */
    /* private */ var onXHRError_ : Any = js.native
    
    /**
      * @private
      * @param {Event} event The load event.
      */
    /* private */ var onXHRLoad_ : Any = js.native
    
    /**
      * @type {Config}
      * @private
      */
    /* private */ var tileJSON_ : Any = js.native
    
    /**
      * @type {number|import("../size.js").Size}
      * @private
      */
    /* private */ var tileSize_ : Any = js.native
  }
}
